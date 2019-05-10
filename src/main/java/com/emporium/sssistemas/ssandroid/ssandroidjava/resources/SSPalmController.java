package com.emporium.sssistemas.ssandroid.ssandroidjava.resources;

import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emporium.sssistemas.ssandroid.ssandroidjava.domains.Lancamento;
import com.emporium.sssistemas.ssandroid.ssandroidjava.domains.Produto;
import com.emporium.sssistemas.ssandroid.ssandroidjava.models.PedidoEmporiumModel;
import com.emporium.sssistemas.ssandroid.ssandroidjava.repositories.PedidoRepository;
import com.emporium.sssistemas.ssandroid.ssandroidjava.repositories.ProdutoRepository;
import com.emporium.sssistemas.ssandroid.ssandroidjava.services.LancamentoService;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
//@RequestMapping(value="/api")
@Api(value="API REST SSAndroid")
@CrossOrigin(origins="*")
public class SSPalmController {

	@Autowired
	ProdutoRepository proRepository;
	@Autowired
	LancamentoService lancamentoService;
	@Autowired
	PedidoRepository pedidoRepository;		
	
	@GetMapping("/produtos")
	@ApiOperation(value="Consulta todos os produtos cadastrados.")
	public List<Produto> listarProdutos(){
		return proRepository.findAll();
	}
	
    @GetMapping("/lancamentos")
    @ApiOperation(value="Consulta todos os lançamento.")
	public List<Lancamento> listarLancamentos(){
		return lancamentoService.listarTodos();
	}
	
	@GetMapping("/lancamentos/{id}")
	@ApiOperation(value="Consulta todas as informações do lançamento atraves do lançamentoId.")
	public ResponseEntity<?> findLancamento(@PathVariable(value="id") long id){
		Lancamento lancamento = lancamentoService.findLancamentoById(id);	
		return ResponseEntity.ok().body(lancamento);
	}
	
	@GetMapping("/lancamentos/atendimento/{id}")
	@ApiOperation(value="Consulta todas as informações do lançamento atraves do atendimentoId.")
	public ResponseEntity<?> findLancamentoByAtendimento(@PathVariable(value="id") long id){
		Lancamento lancamento = lancamentoService.findLancamentoByAtendimentoId(id);	
		return ResponseEntity.ok().body(lancamento);
	}	
	
	//@GetMapping("/lancapedidos")
	@GetMapping(value = "/pedi_json.asp", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="Efetua um pedido no modelo que o SSAndroid trabalha atualmente.")
	public ResponseEntity<?> lancaPedido(@RequestParam(value="json") String pacote) throws Throwable{
		@SuppressWarnings("deprecation")
		String encodedParam = URLDecoder.decode(pacote);
		
		ObjectMapper mapper = new ObjectMapper();
		PedidoEmporiumModel pedido = mapper.readValue(encodedParam, PedidoEmporiumModel.class);
		
		//System.out.println(pedido);
		return ResponseEntity.ok().body(pedido);
	}
	
	@PostMapping("/lancapedido")
	@ApiOperation(value="Efetua pedido.")
	public ResponseEntity<?> lancaPedidos(@RequestBody PedidoEmporiumModel pacote){
		return ResponseEntity.ok().body(pacote);
	}	
	
	/*@GetMapping("/lancamento/{id}")
	public LancamentoModel listarAllLancamentos(@PathVariable(value="id") long id){
		
		Lancamentos lancamento = lancamentoRepository.findById(id);	
		List<PedidosModel> pedidosModel = new ArrayList<PedidosModel>();		
		ModelMapper modelMapper = new ModelMapper();
		
			LancamentoModel l = modelMapper.map(lancamento, LancamentoModel.class);
			List<Pedidos> pedidos = pedidoRepository.findBylancamentoId(lancamento.getLancamentoId());
			
			for (Pedidos p : pedidos) {
				PedidosModel pe = modelMapper.map(p, PedidosModel.class);
				pedidosModel.add(pe);
				
			}
			l.setPedidos(pedidosModel);

		return l;
	}	*/
	
}

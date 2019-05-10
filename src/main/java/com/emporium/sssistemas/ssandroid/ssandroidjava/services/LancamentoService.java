package com.emporium.sssistemas.ssandroid.ssandroidjava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emporium.sssistemas.ssandroid.ssandroidjava.domains.Atendimento;
import com.emporium.sssistemas.ssandroid.ssandroidjava.domains.Lancamento;
import com.emporium.sssistemas.ssandroid.ssandroidjava.domains.Pedido;
import com.emporium.sssistemas.ssandroid.ssandroidjava.domains.Unidade;
import com.emporium.sssistemas.ssandroid.ssandroidjava.models.PedidoEmporiumModel;
import com.emporium.sssistemas.ssandroid.ssandroidjava.repositories.AtendimentoRepository;
import com.emporium.sssistemas.ssandroid.ssandroidjava.repositories.LancamentoRepository;
import com.emporium.sssistemas.ssandroid.ssandroidjava.repositories.PedidoRepository;
import com.emporium.sssistemas.ssandroid.ssandroidjava.repositories.UnidadeRepository;

@Service
public class LancamentoService {
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	@Autowired
	private AtendimentoRepository atendimentoRepository;
	@Autowired
	private UnidadeRepository unidadeRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public List<Lancamento> listarTodos(){
		return lancamentoRepository.findAll();
	}
	
	public Lancamento findLancamentoById(long lancamentoid) {		
		Lancamento obj = lancamentoRepository.findById(lancamentoid);	
		return obj;		
	}
	
	public Lancamento findLancamentoByAtendimentoId(long atendimento) {			
		Atendimento ate = atendimentoRepository.findByAtendimentoId(atendimento);
		Lancamento obj = lancamentoRepository.findByAtendimento(ate);	
		return obj;		
	}	
	
	public Lancamento saveLancacamentoPalm(PedidoEmporiumModel lancamentoEmporium) {	
		Lancamento 	novoLancamento = null;
		Pedido 		novoPedido = null;
		
		Atendimento ate 		= atendimentoRepository.findByAtendimentoId(Integer.parseInt(lancamentoEmporium.getDataFieldList().get(0).getAtendimento()));			
		Lancamento lancamento 	= findLancamentoByAtendimentoId(ate.getAtendimentoId());
		Unidade unidade 		= unidadeRepository.findByUnidadeId(Integer.parseInt(lancamentoEmporium.getDataFieldList().get(0).getUnidade()));
		
		if (lancamento == null) {
			novoLancamento 	= new Lancamento(null, null, null, 0, ate.getTipo(), ate, -1, null, "", 0.00, 0.00, 0.00, 0.00, unidade);			
			novoPedido 		= new Pedido(null, null, -1, 0, 0, 0.00, ate.getAtendimentoId(), null, null, novoLancamento, unidade, null);
			
			pedidoRepository.save(novoPedido);
			
			novoLancamento.getPedidos().add(novoPedido);
		}
		
		lancamentoRepository.save(novoLancamento);
		return novoLancamento;		
	}
	

}

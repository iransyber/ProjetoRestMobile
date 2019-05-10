package com.emporium.sssistemas.ssandroid.ssandroidjava.domains;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="vwpedidos")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;	
	
	@Id 
	@Column(name="pedidoid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long PedidoId;
	@Column(name="conexaoid")
	private Long conexao;
	private Integer natureza;
	
	@Column(name="setorid")
	private Integer setor;
	
	private Integer status;
	@Column(name="vendedorcomissaovalor")
	private Double comissaoValor;
	
	private Long atendimento;
	
	@Column(name="lancamentoorigemid")
	private Long lancamentoOrigemId;
	@Column(name="lancamentodestinoid")
	private Long lancamentoDestinoId;	

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="Lancamentoid")
	private Lancamento lancamento;
	
	@ManyToOne
	@JoinColumn(name="unidadeid")
	private Unidade unidade;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="vendedorid")
	private Fornecedor vendedor;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "pedido")
	private List<PedidoProduto> pedidoproduto = new ArrayList<>();	
	
	public Pedido() {		
	}
	
	public Pedido(Long pedidoId, Long conexao, Integer natureza, Integer setor, Integer status, Double comissaoValor,
			Long atendimento, Long lancamentoOrigemId, Long lancamentoDestinoId, Lancamento lancamento,
			Unidade unidade, Fornecedor vendedor) {
		super();
		PedidoId = pedidoId;
		this.conexao = conexao;
		this.natureza = natureza;
		this.setor = setor;
		this.status = status;
		this.comissaoValor = comissaoValor;
		this.atendimento = atendimento;
		this.lancamentoOrigemId = lancamentoOrigemId;
		this.lancamentoDestinoId = lancamentoDestinoId;
		this.lancamento = lancamento;
		this.unidade = unidade;
		this.vendedor = vendedor;
	}

	public Lancamento getLancamento() {
		return lancamento;
	}
	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}	
	public Long getConexao() {
		return conexao;
	}
	public void setConexao(Long conexao) {
		this.conexao = conexao;
	}
	public Integer getNatureza() {
		return natureza;
	}
	public void setNatureza(Integer natureza) {
		this.natureza = natureza;
	}
	public Integer getSetor() {
		return setor;
	}
	public void setSetor(Integer setor) {
		this.setor = setor;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Double getComissaoValor() {
		return comissaoValor;
	}
	public void setComissaoValor(Double comissaoValor) {
		this.comissaoValor = comissaoValor;
	}
	public Long getAtendimento() {
		return atendimento;
	}
	public void setAtendimento(Long atendimento) {
		this.atendimento = atendimento;
	}
	public Long getLancamentoOrigemId() {
		return lancamentoOrigemId;
	}
	public void setLancamentoOrigemId(Long lancamentoOrigemId) {
		this.lancamentoOrigemId = lancamentoOrigemId;
	}
	public Long getLancamentoDestinoId() {
		return lancamentoDestinoId;
	}
	public void setLancamentoDestinoId(Long lancamentoDestinoId) {
		this.lancamentoDestinoId = lancamentoDestinoId;
	}
	public Fornecedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Fornecedor vendedor) {
		this.vendedor = vendedor;
	}
	public List<PedidoProduto> getPedidoproduto() {
		return pedidoproduto;
	}
	public void setPedidoproduto(List<PedidoProduto> pedidoproduto) {
		this.pedidoproduto = pedidoproduto;
	}
	public long getPedidoId() {
		return PedidoId;
	}
	public void setPedidoId(Long pedidoId) {
		PedidoId = pedidoId;
	}	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PedidoId == null) ? 0 : PedidoId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (PedidoId == null) {
			if (other.PedidoId != null)
				return false;
		} else if (!PedidoId.equals(other.PedidoId))
			return false;
		return true;
	}	
}

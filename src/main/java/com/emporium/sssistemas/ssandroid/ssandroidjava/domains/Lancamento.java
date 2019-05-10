package com.emporium.sssistemas.ssandroid.ssandroidjava.domains;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.*;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="vwlancamentos")
public class Lancamento implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="lancamentoid")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long LancamentoId;
	
	@Column(name="conexaoid")
	@Nullable
	private Long ConexaoId;
	
	@Column(name="lancamentoorigemid")
	@Nullable
	private Integer LancamentoOrigem;
	
	@Column(name="Status")
	private Integer Status;
	
	@Column(name="Tipo")
	private Integer Tipo;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumns({
	       @JoinColumn(name = "atendimento", referencedColumnName="atendimento", insertable = false, updatable = false)
	    })
	private Atendimento atendimento;

	@Column(name="historicoid")
	private Integer Historico;
	
	@Column(name="clienteid")
	@Nullable
	private Long ClienteId;
	
	@Column(name="Memorando")
	@Nullable
	private String Memorando;
	
	@Column(name="valor")
	@Nullable
	private Double ValorLancamento;
	
	@Column(name="Abatimento")
	@Nullable
	private Double Abatimento;
	
	@Column(name="Frete")
	@Nullable
	private Double Frete;
	
	@Column(name="valortotal")
	@Nullable
	private Double ValorTotal;

	@JsonManagedReference
	@OneToMany(mappedBy = "lancamento")
	private List<Pedido> pedidos = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="unidadeid")
	private Unidade unidade;
	
	public Lancamento() {
		
	}	

	public Lancamento(Long lancamentoId, Long conexaoId, Integer lancamentoOrigem, Integer status, Integer tipo,
			Atendimento atendimento, Integer historico, Long clienteId, String memorando, Double valorLancamento,
			Double abatimento, Double frete, Double valorTotal, Unidade unidade) {
		super();
		LancamentoId = lancamentoId;
		ConexaoId = conexaoId;
		LancamentoOrigem = lancamentoOrigem;
		Status = status;
		Tipo = tipo;
		this.atendimento = atendimento;
		Historico = historico;
		ClienteId = clienteId;
		Memorando = memorando;
		ValorLancamento = valorLancamento;
		Abatimento = abatimento;
		Frete = frete;
		ValorTotal = valorTotal;
		this.unidade = unidade;
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public void setLancamentoId(Long lancamentoId) {
		LancamentoId = lancamentoId;
	}
	
	public Long getLancamentoId() {
		return LancamentoId;
	}	

	public void setConexaoId(Long conexaoId) {
		ConexaoId = conexaoId;
	}

	public Long getConexaoId() {
		return ConexaoId;
	}

	public Integer getLancamentoOrigem() {
		return LancamentoOrigem;
	}

	public void setLancamentoOrigem(Integer lancamentoOrigem) {
		LancamentoOrigem = lancamentoOrigem;
	}

	public Integer getStatus() {
		return Status;
	}

	public void setStatus(Integer status) {
		Status = status;
	}

	public Integer getTipo() {
		return Tipo;
	}

	public void setTipo(Integer tipo) {
		Tipo = tipo;
	}

	public void setHistorico(Integer historico) {
		Historico = historico;
	}

	public Long getClienteId() {
		return ClienteId;
	}

	public void setClienteId(Long clienteId) {
		ClienteId = clienteId;
	}

	public String getMemorando() {
		return Memorando;
	}

	public void setMemorando(String memorando) {
		Memorando = memorando;
	}

	public Double getValorLancamento() {
		return ValorLancamento;
	}

	public void setValorLancamento(Double valorLancamento) {
		ValorLancamento = valorLancamento;
	}

	public Double getAbatimento() {
		return Abatimento;
	}

	public void setAbatimento(Double abatimento) {
		Abatimento = abatimento;
	}

	public Double getFrete() {
		return Frete;
	}

	public void setFrete(Double frete) {
		Frete = frete;
	}

	public Double getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		ValorTotal = valorTotal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (LancamentoId ^ (LancamentoId >>> 32));
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
		Lancamento other = (Lancamento) obj;
		if (LancamentoId != other.LancamentoId)
			return false;
		return true;
	}	
}

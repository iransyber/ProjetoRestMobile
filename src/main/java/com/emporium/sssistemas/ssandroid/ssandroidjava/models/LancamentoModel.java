package com.emporium.sssistemas.ssandroid.ssandroidjava.models;

import java.io.Serializable;
import java.util.List;

public class LancamentoModel implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long LancamentoId;
	private Long ConexaoId;
	private Integer LancamentoOrigem;
	private byte Status;
	private Integer Tipo;
	private Integer Atendimento;
	private Integer UnidadeId;
	private Integer Historico;
	private Long ClienteId;
	private String Memorando;
	private Double ValorLancamento;
	private Double Abatimento;
	private Double Frete;
	private List<PedidosModel> Pedidos;
	
	public List<PedidosModel> getPedidos() {
		return Pedidos;
	}
	public void setPedidos(List<PedidosModel> pedidos) {
		Pedidos = pedidos;
	}
	public Long getLancamentoId() {
		return LancamentoId;
	}
	public void setLancamentoId(Long lancamentoId) {
		LancamentoId = lancamentoId;
	}
	public Long getConexaoId() {
		return ConexaoId;
	}
	public void setConexaoId(Long conexaoId) {
		ConexaoId = conexaoId;
	}
	public Integer getLancamentoOrigem() {
		return LancamentoOrigem;
	}
	public void setLancamentoOrigem(Integer lancamentoOrigem) {
		LancamentoOrigem = lancamentoOrigem;
	}
	public byte getStatus() {
		return Status;
	}
	public void setStatus(byte status) {
		Status = status;
	}
	public Integer getTipo() {
		return Tipo;
	}
	public void setTipo(Integer tipo) {
		Tipo = tipo;
	}
	public Integer getAtendimento() {
		return Atendimento;
	}
	public void setAtendimento(Integer atendimento) {
		Atendimento = atendimento;
	}
	public Integer getUnidadeId() {
		return UnidadeId;
	}
	public void setUnidadeId(Integer unidadeId) {
		UnidadeId = unidadeId;
	}
	public Integer getHistorico() {
		return Historico;
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
	private Double ValorTotal;

}

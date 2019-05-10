package com.emporium.sssistemas.ssandroid.ssandroidjava.models;

import java.io.Serializable;

public class PedidosModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long LancamentoId;
	private Long PedidoId;
	
	public Long getLancamentoId() {
		return LancamentoId;
	}
	public void setLancamentoId(Long lancamentoId) {
		LancamentoId = lancamentoId;
	}
	public Long getPedidoId() {
		return PedidoId;
	}
	public void setPedidoId(Long pedidoId) {
		PedidoId = pedidoId;
	}
}

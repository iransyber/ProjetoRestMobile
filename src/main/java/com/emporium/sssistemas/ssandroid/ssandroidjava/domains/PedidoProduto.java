package com.emporium.sssistemas.ssandroid.ssandroidjava.domains;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="vwpedidosprodutos")
public class PedidoProduto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pedidoprodutoid")
	private Long pedidoProdutoId;
	private Integer item;
	@Column(name="subitem")	
	private Integer subItem;

	@Column(name="Qde")
	private Double quantidade;
	private Double preco;
	@Column(name="precototal")
	private Double precoTotal;
	
	@JsonManagedReference
	@OneToOne
	@JoinColumn(name="produtoid")
	private Produto produto;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="pedidoid")
	private Pedido pedido;
	
	public PedidoProduto() {		
	}	
	
	public PedidoProduto(Long pedidoProdutoId, Integer item, Integer subItem, Double quantidade, Double preco,
			Double precoTotal, Produto produto, Pedido pedido) {
		super();
		this.pedidoProdutoId = pedidoProdutoId;
		this.item = item;
		this.subItem = subItem;
		this.quantidade = quantidade;
		this.preco = preco;
		this.precoTotal = precoTotal;
		this.produto = produto;
		this.pedido = pedido;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}	

	public Long getPedidoProdutoId() {
		return pedidoProdutoId;
	}

	public void setPedidoProdutoId(Long pedidoProdutoId) {
		this.pedidoProdutoId = pedidoProdutoId;
	}

	public Integer getItem() {
		return item;
	}

	public void setItem(Integer item) {
		this.item = item;
	}

	public Integer getSubItem() {
		return subItem;
	}

	public void setSubItem(Integer subItem) {
		this.subItem = subItem;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pedidoProdutoId == null) ? 0 : pedidoProdutoId.hashCode());
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
		PedidoProduto other = (PedidoProduto) obj;
		if (pedidoProdutoId == null) {
			if (other.pedidoProdutoId != null)
				return false;
		} else if (!pedidoProdutoId.equals(other.pedidoProdutoId))
			return false;
		return true;
	}
	
	

}

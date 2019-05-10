package com.emporium.sssistemas.ssandroid.ssandroidjava.domains;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Produtos")
public class Produto implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="Código")
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="Descrição")
	private String ProdutoNome; 

	@Column(name="Apelido")
	private String ProdutoApelido;
	
	@JsonBackReference
	@OneToMany(mappedBy = "produto")
	private List<PedidoProduto> pedidosprodutos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProdutoNome() {
		return ProdutoNome;
	}

	public void setProdutoNome(String produtoNome) {
		ProdutoNome = produtoNome;
	}

	public String getProdutoApelido() {
		return ProdutoApelido;
	}

	public void setProdutoApelido(String produtoApelido) {
		ProdutoApelido = produtoApelido;
	}	
}

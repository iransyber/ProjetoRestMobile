package com.emporium.sssistemas.ssandroid.ssandroidjava.domains;

import java.io.Serializable;
import java.util.ArrayList;
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
@Table(name="Fornecedores")
public class Fornecedor implements Serializable {	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="código")
	private Long fornecedorid;
	private String nome;
	private String apelido;
	private Boolean vendedor;
	@Column(name="garçon")
	private Boolean garcon;
	private Boolean ativo;
	@Column(name="comissão")
	private Double comissao;
	
	@JsonBackReference
	@OneToMany(mappedBy = "vendedor")
	private List<Pedido> pedidos = new ArrayList<Pedido>();	
	
	@JsonBackReference
	@OneToMany(mappedBy = "vendedor")
	private List<Atendimento> atendimentos = new ArrayList<>();
	
	public Fornecedor() {		
	}
	
	public Fornecedor(Long fornecedorid, String nome, String apelido, Boolean vendedor, Boolean garcon, Boolean ativo,
			Double comissao) {
		super();
		this.fornecedorid = fornecedorid;
		this.nome = nome;
		this.apelido = apelido;
		this.vendedor = vendedor;
		this.garcon = garcon;
		this.ativo = ativo;
		this.comissao = comissao;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}
	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}
	public Long getFornecedorId() {
		return fornecedorid;
	}
	public void setFornecedorId(Long fornecedorId) {
		this.fornecedorid = fornecedorId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public Boolean getVendedor() {
		return vendedor;
	}
	public void setVendedor(Boolean vendedor) {
		this.vendedor = vendedor;
	}
	public Boolean getGarcon() {
		return garcon;
	}
	public void setGarcon(Boolean garcon) {
		this.garcon = garcon;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public Double getComissao() {
		return comissao;
	}
	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fornecedorid == null) ? 0 : fornecedorid.hashCode());
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
		Fornecedor other = (Fornecedor) obj;
		if (fornecedorid == null) {
			if (other.fornecedorid != null)
				return false;
		} else if (!fornecedorid.equals(other.fornecedorid))
			return false;
		return true;
	}
	
	

}

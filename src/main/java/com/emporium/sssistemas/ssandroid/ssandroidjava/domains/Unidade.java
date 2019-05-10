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

@Entity
@Table(name="vwunidades")
public class Unidade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="unidadeid")
	private Long unidadeId;	
	@Column(name="unidadenome")
	private String unidadeNome;	
	@Column(name="unidadesigla")
	private String unidadeSigla;
	private Integer status;
	private Boolean ativo;
	private String cnpj;
	@Column(name="razaosocial")
	private String razaoSocial;
	private String uf;
	
	@OneToMany(mappedBy = "unidade")
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	
	@OneToMany(mappedBy = "unidade")
	private List<Lancamento> lancamentos = new ArrayList<Lancamento>();
	
	@OneToMany(mappedBy = "unidade")
	private List<Atendimento> atendimento = new ArrayList<Atendimento>();
	
	public Long getUnidadeId() {
		return unidadeId;
	}
	public void setUnidadeId(Long unidadeId) {
		this.unidadeId = unidadeId;
	}
	public String getUnidadeNome() {
		return unidadeNome;
	}
	public void setUnidadeNome(String unidadeNome) {
		this.unidadeNome = unidadeNome;
	}
	public String getUnidadeSigla() {
		return unidadeSigla;
	}
	public void setUnidadeSigla(String unidadeSigla) {
		this.unidadeSigla = unidadeSigla;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((unidadeId == null) ? 0 : unidadeId.hashCode());
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
		Unidade other = (Unidade) obj;
		if (unidadeId == null) {
			if (other.unidadeId != null)
				return false;
		} else if (!unidadeId.equals(other.unidadeId))
			return false;
		return true;
	}

	
}

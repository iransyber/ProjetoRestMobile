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
@Table(name="vwatendimentos")
public class Atendimento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="atendimentoid2")
	private Long atendimentoId;
	
	@ManyToOne
	@JoinColumn(name="unidadeid")
	private Unidade unidade;
	
	@Column(name="atendimento")
	private Long atendimentonumero;
	private Byte status;
	private Boolean ativo;
	private Integer tipo;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="vendedorid")
	private Fornecedor vendedor;
	
	@JsonBackReference
	@OneToMany(mappedBy = "atendimento")
	private List<Lancamento> lancamentos = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="modalidadeid")
	private Modalidade modalidade;
	
	private String rfid;
	private Boolean checkin;
	
	public Atendimento() {		
	}	
	
	public Atendimento(Long atendimentoId, Unidade unidade, Long atendimentonumero, Byte status, Boolean ativo,
			Integer tipo, Fornecedor vendedor, Modalidade modalidade, String rfid, Boolean checkin) {
		super();
		this.atendimentoId = atendimentoId;
		this.unidade = unidade;
		this.atendimentonumero = atendimentonumero;
		this.status = status;
		this.ativo = ativo;
		this.tipo = tipo;
		this.vendedor = vendedor;
		this.modalidade = modalidade;
		this.rfid = rfid;
		this.checkin = checkin;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}
	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	public Long getAtendimentoId() {
		return atendimentoId;
	}
	public void setAtendimentoId(Long atendimentoId) {
		this.atendimentoId = atendimentoId;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	public Long getAtendimentonumero() {
		return atendimentonumero;
	}
	public void setAtendimentonumero(Long atendimentonumero) {
		this.atendimentonumero = atendimentonumero;
	}
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public Fornecedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Fornecedor vendedor) {
		this.vendedor = vendedor;
	}
	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	public Boolean getCheckin() {
		return checkin;
	}
	public void setCheckin(Boolean checkin) {
		this.checkin = checkin;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atendimentoId == null) ? 0 : atendimentoId.hashCode());
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
		Atendimento other = (Atendimento) obj;
		if (atendimentoId == null) {
			if (other.atendimentoId != null)
				return false;
		} else if (!atendimentoId.equals(other.atendimentoId))
			return false;
		return true;
	}
	
	

}

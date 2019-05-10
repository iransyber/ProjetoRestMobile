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
@Table(name="vwmodalidades")
public class Modalidade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="modalidadeid")
	private Long modalidadeId;
	@Column(name="modalidadenome")
	private String modalidadeNome;
	@Column(name="modalidadesigla")	
	private String modalidadeSigla;
	private Byte status;
	
	@OneToMany(mappedBy = "modalidade") 
	private List<Atendimento> atendimento = new ArrayList<>();
	
	public Long getModalidadeId() {
		return modalidadeId;
	}
	public void setModalidadeId(Long modalidadeId) {
		this.modalidadeId = modalidadeId;
	}
	public String getModalidadeNome() {
		return modalidadeNome;
	}
	public void setModalidadeNome(String modalidadeNome) {
		this.modalidadeNome = modalidadeNome;
	}
	public String getModalidadeSigla() {
		return modalidadeSigla;
	}
	public void setModalidadeSigla(String modalidadeSigla) {
		this.modalidadeSigla = modalidadeSigla;
	}
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modalidadeId == null) ? 0 : modalidadeId.hashCode());
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
		Modalidade other = (Modalidade) obj;
		if (modalidadeId == null) {
			if (other.modalidadeId != null)
				return false;
		} else if (!modalidadeId.equals(other.modalidadeId))
			return false;
		return true;
	}	
	
}

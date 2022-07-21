package com.agregador.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_eleitor")
public class TblEleitor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7245569898318794197L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_eleitor")
	private long id;

	@Column(name = "nome_eleitor")
	private String nomeEleitor;

	@Column(name = "num_inscricao_eleitor")
	private String numInscricaoEleitor;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_nascimento")
	private Date dtNascimento;

	@ManyToOne
	@JoinColumn(name = "id_zona_eleitoral")
	private TblZonaEleitoral zonaEleitoral;

	@ManyToOne
	@JoinColumn(name = "id_secao_eleitoral")
	private TblSecaoEleitoral secaoEleitoral;
	
	public TblEleitor() {
	}

	public TblEleitor(long id, String nomeEleitor, String numInscricaoEleitor, TblZonaEleitoral zonaEleitoral,
			TblSecaoEleitoral secaoEleitoral) {
		super();
		this.id = id;
		this.nomeEleitor = nomeEleitor;
		this.numInscricaoEleitor = numInscricaoEleitor;
		this.zonaEleitoral = zonaEleitoral;
		this.secaoEleitoral = secaoEleitoral;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeEleitor() {
		return nomeEleitor;
	}

	public void setNomeEleitor(String nomeEleitor) {
		this.nomeEleitor = nomeEleitor;
	}

	public String getNumInscricaoEleitor() {
		return numInscricaoEleitor;
	}

	public void setNumInscricaoEleitor(String numInscricaoEleitor) {
		this.numInscricaoEleitor = numInscricaoEleitor;
	}

	public TblZonaEleitoral getZonaEleitoral() {
		return zonaEleitoral;
	}

	public void setZonaEleitoral(TblZonaEleitoral zonaEleitoral) {
		this.zonaEleitoral = zonaEleitoral;
	}

	public TblSecaoEleitoral getSecaoEleitoral() {
		return secaoEleitoral;
	}

	public void setSecaoEleitoral(TblSecaoEleitoral secaoEleitoral) {
		this.secaoEleitoral = secaoEleitoral;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
}

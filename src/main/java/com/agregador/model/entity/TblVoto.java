package com.agregador.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_voto")
public class TblVoto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7245569898318794197L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_voto")
	private long id;

	@ManyToOne
	@JoinColumn(name = "id_eleitor")
	private TblEleitor eleitor;

	@ManyToOne
	@JoinColumn(name = "id_candidato")
	private TblCandidato candidato;

	@ManyToOne
	@JoinColumn(name = "id_zona")
	private TblZonaEleitoral zona;

	@ManyToOne
	@JoinColumn(name = "id_secao")
	private TblSecaoEleitoral secao;

	@ManyToOne
	@JoinColumn(name = "id_mesario")
	private TblMesario mesario;

	public TblVoto(long id, TblEleitor eleitor, TblCandidato candidato, TblZonaEleitoral zona, TblSecaoEleitoral secao,
			TblMesario mesario) {
		super();
		this.id = id;
		this.eleitor = eleitor;
		this.candidato = candidato;
		this.zona = zona;
		this.secao = secao;
		this.mesario = mesario;
	}

	public TblVoto() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TblEleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(TblEleitor eleitor) {
		this.eleitor = eleitor;
	}

	public TblCandidato getCandidato() {
		return candidato;
	}

	public void setCandidato(TblCandidato candidato) {
		this.candidato = candidato;
	}

	public TblZonaEleitoral getZona() {
		return zona;
	}

	public void setZona(TblZonaEleitoral zona) {
		this.zona = zona;
	}

	public TblSecaoEleitoral getSecao() {
		return secao;
	}

	public void setSecao(TblSecaoEleitoral secao) {
		this.secao = secao;
	}

	public TblMesario getMesario() {
		return mesario;
	}

	public void setMesario(TblMesario mesario) {
		this.mesario = mesario;
	}

}

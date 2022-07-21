package com.agregador.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tutorials")
public class TblCandidato implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7245569898318794197L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_candidato")
	private long id;

	@Column(name = "nome_candidato")
	private String nomeCandidato;

	@Column(name = "num_candidato")
	private long numCandidato;

	@Column(name = "tp_candidato")
	private long tpCandidato;
	
	public TblCandidato(long id, String nomeCandidato, long numCandidato, long tpCandidato) {
		super();
		this.id = id;
		this.nomeCandidato = nomeCandidato;
		this.numCandidato = numCandidato;
		this.tpCandidato = tpCandidato;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public long getNumCandidato() {
		return numCandidato;
	}

	public void setNumCandidato(long numCandidato) {
		this.numCandidato = numCandidato;
	}

	public long getTpCandidato() {
		return tpCandidato;
	}

	public void setTpCandidato(long tpCandidato) {
		this.tpCandidato = tpCandidato;
	}

}

package com.agregador.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_zona_eleitoral")
public class TblZonaEleitoral implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7245569898318794197L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_zona_eleitoral")
	private long id;

	@Column(name = "regiao_zona_eleitoral")
	private String regiaoZonaEleitoral;

	@Column(name = "numero_zona_eleitoral")
	private long numeroZonaEleitoral;

	public TblZonaEleitoral(long id, String regiaoZonaEleitoral, long numeroZonaEleitoral) {
		super();
		this.id = id;
		this.regiaoZonaEleitoral = regiaoZonaEleitoral;
		this.numeroZonaEleitoral = numeroZonaEleitoral;
	}
	
	public TblZonaEleitoral() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRegiaoZonaEleitoral() {
		return regiaoZonaEleitoral;
	}

	public void setRegiaoZonaEleitoral(String regiaoZonaEleitoral) {
		this.regiaoZonaEleitoral = regiaoZonaEleitoral;
	}

	public long getNumeroZonaEleitoral() {
		return numeroZonaEleitoral;
	}

	public void setNumeroZonaEleitoral(long numeroZonaEleitoral) {
		this.numeroZonaEleitoral = numeroZonaEleitoral;
	}

}

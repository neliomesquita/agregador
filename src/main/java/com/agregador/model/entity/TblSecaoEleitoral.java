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
@Table(name = "tbl_secao_eleitoral")
public class TblSecaoEleitoral implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7245569898318794197L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_secao")
	private long id;

	@Column(name = "num_secao")
	private long numSecao;

	@ManyToOne
	@JoinColumn(name = "id_zona_eleitoral")
	private TblZonaEleitoral zonaEleitoral;

	public TblSecaoEleitoral(long id, long numSecao, TblZonaEleitoral zonaEleitoral) {
		super();
		this.id = id;
		this.numSecao = numSecao;
		this.zonaEleitoral = zonaEleitoral;
	}
	
	public TblSecaoEleitoral() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getNumSecao() {
		return numSecao;
	}

	public void setNumSecao(long numSecao) {
		this.numSecao = numSecao;
	}

	public TblZonaEleitoral getZonaEleitoral() {
		return zonaEleitoral;
	}

	public void setZonaEleitoral(TblZonaEleitoral zonaEleitoral) {
		this.zonaEleitoral = zonaEleitoral;
	}

}

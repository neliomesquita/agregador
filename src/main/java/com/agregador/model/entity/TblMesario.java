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
@Table(name = "tbl_mesario")
public class TblMesario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7245569898318794197L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_mesario")
	private long id;

	@Column(name = "titulo_eleitoral")
	private String tituloEleitoral;

	@Column(name = "nome_mesario")
	private String nomeMesario;

	@ManyToOne
	@JoinColumn(name = "id_zona")
	private TblZonaEleitoral zona;

	@ManyToOne
	@JoinColumn(name = "id_secao")
	private TblSecaoEleitoral secao;

	public TblMesario() {
	}

	public TblMesario(long id, String tituloEleitoral, String nomeMesario, TblZonaEleitoral zona,
			TblSecaoEleitoral secao) {
		super();
		this.id = id;
		this.tituloEleitoral = tituloEleitoral;
		this.nomeMesario = nomeMesario;
		this.zona = zona;
		this.secao = secao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTituloEleitoral() {
		return tituloEleitoral;
	}

	public void setTituloEleitoral(String tituloEleitoral) {
		this.tituloEleitoral = tituloEleitoral;
	}

	public String getNomeMesario() {
		return nomeMesario;
	}

	public void setNomeMesario(String nomeMesario) {
		this.nomeMesario = nomeMesario;
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

}

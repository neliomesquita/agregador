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
@Table(name = "tbl_justificativa")
public class TblJustificativa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7245569898318794197L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_justificativa")
	private long id;

	@ManyToOne
	@JoinColumn(name = "id_eleitor")
	private TblEleitor eleitor;

	@ManyToOne
	@JoinColumn(name = "id_mesario")
	private TblMesario mesario;

	@Column(name = "email")
	private String email;
	
	@Column(name = "telefone")
	private String telefone;
	
		@Column(name = "motivo_ausencia")
	private String motivoAusencia;
	
	@Column(name = "ano_eleicao")
	private String anoEleicao;
	

	public TblJustificativa() {
		// TODO Auto-generated constructor stub
	}


	public TblJustificativa(long id, TblEleitor eleitor, TblMesario mesario, String email, String telefone,
			String motivoAusencia, String anoEleicao) {
		super();
		this.id = id;
		this.eleitor = eleitor;
		this.mesario = mesario;
		this.email = email;
		this.telefone = telefone;
		this.motivoAusencia = motivoAusencia;
		this.anoEleicao = anoEleicao;
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


	public TblMesario getMesario() {
		return mesario;
	}


	public void setMesario(TblMesario mesario) {
		this.mesario = mesario;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getMotivoAusencia() {
		return motivoAusencia;
	}


	public void setMotivoAusencia(String motivoAusencia) {
		this.motivoAusencia = motivoAusencia;
	}


	public String getAnoEleicao() {
		return anoEleicao;
	}


	public void setAnoEleicao(String anoEleicao) {
		this.anoEleicao = anoEleicao;
	}

}

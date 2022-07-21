package com.agregador.model.service;


import com.agregador.model.entity.TblMesario;

public interface MesarioService {

	TblMesario pesquisarMesario(String tituloEleitoral, String nomeMesario, long numeroZonaEleitoral, long numSecao);
}

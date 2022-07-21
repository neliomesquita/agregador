package com.agregador.model.service;

import java.util.List;

import com.agregador.model.entity.TblEleitor;

public interface EleitorService {

	TblEleitor pesquisarEleitor(String nomeEleitor, String numInscricaoEleitor, String dtNascimento);
}

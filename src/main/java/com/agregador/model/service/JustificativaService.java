package com.agregador.model.service;

import java.util.List;
import com.agregador.model.entity.TblJustificativa;

public interface JustificativaService {

	TblJustificativa pesquisarJustificativa(Long id);
	List<TblJustificativa> obterTodos();
	TblJustificativa criar(TblJustificativa justificativa);
}

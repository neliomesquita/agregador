package com.agregador.model.service;

import java.util.List;
import com.agregador.model.entity.TblZonaEleitoral;

public interface ZonaService {

	TblZonaEleitoral pesquisaZonaEleitoral(Long id);
	List<TblZonaEleitoral> obterTodos();
}

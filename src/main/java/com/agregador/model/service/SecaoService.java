package com.agregador.model.service;

import java.util.List;
import com.agregador.model.entity.TblSecaoEleitoral;

public interface SecaoService {

	TblSecaoEleitoral pesquisaSecaoEleitoral(Long id);
	List<TblSecaoEleitoral> obterTodos();
}

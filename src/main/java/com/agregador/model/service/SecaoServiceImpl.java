package com.agregador.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.agregador.model.entity.TblSecaoEleitoral;
import com.agregador.model.repository.SecaoEleitoralRepository;

@Service
public class SecaoServiceImpl implements SecaoService{
	
	@Autowired
	private SecaoEleitoralRepository secaoEleitoralRepository;

	@Override
	public TblSecaoEleitoral pesquisaSecaoEleitoral(Long id) {
		return this.secaoEleitoralRepository.getById(id);
	}

	@Override
	public List<TblSecaoEleitoral> obterTodos() {
		return this.secaoEleitoralRepository.findAll();
	}

	
}

package com.agregador.model.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agregador.model.entity.TblJustificativa;
import com.agregador.model.entity.TblZonaEleitoral;
import com.agregador.model.repository.JustificativaRepository;
import com.agregador.model.repository.ZonaEleitoralRepository;

@Service
public class JustificativaServiceImpl implements JustificativaService{
	
	@Autowired
	private JustificativaRepository justificativaRepository;

	@Override
	public TblJustificativa pesquisarJustificativa(Long id) {
		return this.justificativaRepository.getById(id);
	}

	@Override
	public List<TblJustificativa> obterTodos() {
		return this.justificativaRepository.findAll();
	}

	@Override
	public TblJustificativa criar(TblJustificativa justificativa) {
		return this.justificativaRepository.save(justificativa);
	}

}

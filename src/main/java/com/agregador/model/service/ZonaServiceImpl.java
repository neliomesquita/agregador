package com.agregador.model.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.agregador.model.entity.TblZonaEleitoral;
import com.agregador.model.repository.ZonaEleitoralRepository;

@Service
public class ZonaServiceImpl implements ZonaService{
	
	@Autowired
	private ZonaEleitoralRepository zonaEleitoralRepository;

	@Override
	public TblZonaEleitoral pesquisaZonaEleitoral(Long id) {
		return this.zonaEleitoralRepository.getById(id);
	}

	@Override
	public List<TblZonaEleitoral> obterTodos() {
		return this.zonaEleitoralRepository.findAll();
	}

}

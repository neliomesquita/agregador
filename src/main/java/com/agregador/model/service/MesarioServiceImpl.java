package com.agregador.model.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.agregador.model.entity.TblMesario;
import com.agregador.model.entity.TblSecaoEleitoral;
import com.agregador.model.entity.TblZonaEleitoral;
import com.agregador.model.repository.MesarioRepository;
import com.agregador.model.repository.SecaoEleitoralRepository;
import com.agregador.model.repository.ZonaEleitoralRepository;

@Service
public class MesarioServiceImpl implements MesarioService{
	
	@Autowired
	private MesarioRepository mesarioRepository;
	@Autowired
	private SecaoEleitoralRepository secaoEleitoralRepository;
	@Autowired
	private ZonaEleitoralRepository zonaEleitoralRepository;

	@Override
	public TblMesario pesquisarMesario(String tituloEleitoral, String nomeMesario, long numeroZonaEleitoral, long numSecao) {
		
		TblZonaEleitoral tblZonaEleitoral = new TblZonaEleitoral();
		List<TblZonaEleitoral> listaZonaEleitoral = new ArrayList<TblZonaEleitoral>();
		listaZonaEleitoral=this.zonaEleitoralRepository.findAll();
		if(listaZonaEleitoral!=null && listaZonaEleitoral.size()>0)
		for(TblZonaEleitoral ze : listaZonaEleitoral){
			if(ze.getNumeroZonaEleitoral() == numeroZonaEleitoral ) {
				tblZonaEleitoral = ze; break;
			}
		}
		
		TblSecaoEleitoral tblsecaoEleitoral = new TblSecaoEleitoral();
		List<TblSecaoEleitoral> listaSecaoEleitoral = new ArrayList<TblSecaoEleitoral>();
		listaSecaoEleitoral.addAll(this.secaoEleitoralRepository.findAll());
		if(listaSecaoEleitoral!=null && listaSecaoEleitoral.size()>0)
		for(TblSecaoEleitoral se : listaSecaoEleitoral){
			if(se.getNumSecao() == numSecao ) {
				tblsecaoEleitoral = se; break;
			}
		}
		
		TblMesario tblMesario = new TblMesario();
		List<TblMesario> listaMesario = new ArrayList<TblMesario>();
		listaMesario.addAll(this.mesarioRepository.findAll());
		
		if(listaMesario!=null && listaMesario.size()>0)
		for(TblMesario m : listaMesario){
			if((!"".equals(tituloEleitoral) && tituloEleitoral!=null) && (!"".equals(nomeMesario) && nomeMesario!=null) &&
			   (tblZonaEleitoral!=null && tblZonaEleitoral.getId()!=0l) && 
			   (tblsecaoEleitoral!=null && tblsecaoEleitoral.getId()!=0l) ) {
				tblMesario = m; 
				break;
			}
		}
		
		return tblMesario;
	}

	

}

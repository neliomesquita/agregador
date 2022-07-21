package com.agregador.model.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agregador.model.entity.TblEleitor;
import com.agregador.model.repository.EleitorRepository;

@Service
public class EleitorServiceImpl implements EleitorService{
	
	@Autowired
	private EleitorRepository eleitorRepository;

	@Override
	public TblEleitor pesquisarEleitor(String nomeEleitor, String tituloEleitor, String dtNascimento) {
		TblEleitor tblEleitor = new TblEleitor();
		List<TblEleitor> eleitores = new ArrayList<TblEleitor>();
		try {
		SimpleDateFormat formate = new SimpleDateFormat("YYYY-mm-dd");
		eleitores = this.eleitorRepository.findAll();
			Date dt = new Date();
			if((!"".equals(nomeEleitor) && nomeEleitor!=null) && (!"".equals(tituloEleitor) && tituloEleitor!=null) && (!"".equals(dtNascimento) && dtNascimento!=null)) {
				dt = formate.parse(dtNascimento);
				if(eleitores!=null && eleitores.size()>0)
				for(TblEleitor e: eleitores) {
				   if(e.getNomeEleitor().equals(nomeEleitor) && e.getNumInscricaoEleitor().equals(tituloEleitor) && e.getDtNascimento().equals(dt)) {
					   tblEleitor = e;
					   break;					   
				   }
			    }
		    }
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		return tblEleitor;
	}

}

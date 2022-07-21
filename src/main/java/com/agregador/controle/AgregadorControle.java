package com.agregador.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.agregador.model.entity.TblEleitor;
import com.agregador.model.entity.TblJustificativa;
import com.agregador.model.entity.TblMesario;
import com.agregador.model.service.EleitorService;
import com.agregador.model.service.JustificativaService;
import com.agregador.model.service.MesarioService;

@RestController
@RequestMapping(path = "/agregador")
public class AgregadorControle {
	
	@Autowired
	private EleitorService eleitorService;
	@Autowired
	private MesarioService mesarioService;
	@Autowired
	private JustificativaService justificativaService;
	
	@GetMapping(path ="/pesquisarEleitor/{nomeEleitor}/{tituloEleitor}/{dtNascimento}")
	public ResponseEntity<TblEleitor> pesquisarEleitor(@PathVariable(name = "nomeEleitor") String nomeEleitor,
													   @PathVariable(name = "tituloEleitor") String tituloEleitor,
													   @PathVariable(name = "dtNascimento") String dtNascimento) {
		return ResponseEntity.ok(this.eleitorService.pesquisarEleitor( nomeEleitor,  tituloEleitor,  dtNascimento));
	}
	
	@GetMapping(path ="/pesquisarMesario/{tituloEleitoral}/{nomeMesario}/{numeroZonaEleitoral}/{numSecao}")
	public ResponseEntity<TblMesario> pesquisarMesario(@PathVariable(name = "tituloEleitoral") String tituloEleitoral,
													   @PathVariable(name = "nomeMesario") String nomeMesario,
													   @PathVariable(name = "numeroZonaEleitoral") String numeroZonaEleitoral,
													   @PathVariable(name = "numSecao") String numSecao) {
		return ResponseEntity.ok(this.mesarioService.pesquisarMesario(tituloEleitoral, nomeMesario, Long.parseLong(numeroZonaEleitoral), Long.parseLong(numSecao)));
	}
	
	@PostMapping("/criarJustificativa")
	public ResponseEntity<TblJustificativa> criar(@RequestBody TblJustificativa justificativa){
		return ResponseEntity.ok(this.justificativaService.criar(justificativa));
	}

}

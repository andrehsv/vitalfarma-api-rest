package com.api.vitalfarma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.vitalfarma.model.dto.CosmeticoDTO;
import com.api.vitalfarma.model.dto.RemedioDTO;
import com.api.vitalfarma.model.dto.SuplementoDTO;
import com.api.vitalfarma.model.response.MostrarTodosProdutosResponse;

@Service
public class ProdutoService {
	
	@Autowired
	private RemedioService servicoRemedio;
	
	@Autowired
	private SuplementoService servicoSuplemento;
	
	@Autowired
	private CosmeticoService servicoCosmetico;
	
	public List<RemedioDTO> mostrarRemedios() {
		return servicoRemedio.mostrarTodos();
	}
	
	public List<SuplementoDTO> mostrarSuplementos() {
		return servicoSuplemento.mostrarTodos();
	}
	
	public List<CosmeticoDTO> mostrarCosmeticos() {
		return servicoCosmetico.mostrarTodos();
	}
	
	public ResponseEntity<?> mostrarTodosOsProdutos() {
		MostrarTodosProdutosResponse body = new MostrarTodosProdutosResponse(
				mostrarRemedios(),
				mostrarSuplementos(),
				mostrarCosmeticos());
		
		return ResponseEntity.ok(body);
	}
	
	public RemedioDTO adicionarRemedio(RemedioDTO remedio) {
		return servicoRemedio.adicionar(remedio);
	}
	
	public SuplementoDTO adicionarSuplemento(SuplementoDTO suplemento) {
		return servicoSuplemento.adicionar(suplemento);
	}
	
	public CosmeticoDTO adicionarCosmetico(CosmeticoDTO cosmetico) {
		return servicoCosmetico.adicionar(cosmetico);
	}
}

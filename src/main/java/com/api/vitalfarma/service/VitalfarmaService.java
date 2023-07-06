package com.api.vitalfarma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.vitalfarma.model.dto.CosmeticoDTO;
import com.api.vitalfarma.model.dto.RemedioDTO;
import com.api.vitalfarma.model.dto.SuplementoDTO;

@Service
public class VitalfarmaService {
	
	@Autowired
	private ProdutoService servicoProduto;
	
	public ResponseEntity<?> mostrarTodosProdutos() {
		return servicoProduto.mostrarTodosOsProdutos();
	}
	
	public RemedioDTO adicionarRemedio(RemedioDTO remedio) {
		return servicoProduto.adicionarRemedio(remedio);
	}
	
	public SuplementoDTO adicionarSuplemento(SuplementoDTO suplemento) {
		return servicoProduto.adicionarSuplemento(suplemento);
	}
	
	public CosmeticoDTO adicionarCosmetico(CosmeticoDTO cosmetico) {
		return servicoProduto.adicionarCosmetico(cosmetico);
	}
	
}

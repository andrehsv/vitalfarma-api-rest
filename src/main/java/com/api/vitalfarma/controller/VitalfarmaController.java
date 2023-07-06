package com.api.vitalfarma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.vitalfarma.model.dto.CosmeticoDTO;
import com.api.vitalfarma.model.dto.RemedioDTO;
import com.api.vitalfarma.model.dto.SuplementoDTO;
import com.api.vitalfarma.service.VitalfarmaService;

@RestController
@RequestMapping("/api")
public class VitalfarmaController {
	
	@Autowired
	private VitalfarmaService servico;
	
	@GetMapping("/mostrar-todos-produtos")
	public ResponseEntity<?> mostrarTodosProdutos() {
		return servico.mostrarTodosProdutos();
	}
	
	@PostMapping("/adicionar-remedio")
	public RemedioDTO adicionarProduto(@RequestBody RemedioDTO remedio) {
		return servico.adicionarRemedio(remedio);
	}
	
	@PostMapping("/adicionar-suplemento")
	public SuplementoDTO adicionarProduto(@RequestBody SuplementoDTO suplemento) {
		return servico.adicionarSuplemento(suplemento);
	}
	
	@PostMapping("/adicionar-cosmetico")
	public CosmeticoDTO adicionarProduto(@RequestBody CosmeticoDTO cosmetico) {
		return servico.adicionarCosmetico(cosmetico);
	}
}

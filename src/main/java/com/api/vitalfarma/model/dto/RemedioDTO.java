package com.api.vitalfarma.model.dto;

import com.api.vitalfarma.model.Categoria;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RemedioDTO {
	
	private long id;
	private String nome;
	private double preco;
	private String categoria = Categoria.REMEDIO.toString();
	
}

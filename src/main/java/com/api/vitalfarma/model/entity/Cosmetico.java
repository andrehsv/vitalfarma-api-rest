package com.api.vitalfarma.model.entity;

import org.hibernate.annotations.GenericGenerator;

import com.api.vitalfarma.model.Categoria;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "cosmeticos")
public class Cosmetico {
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private long id;
	private String nome;
	private double preco;
	private String categoria = Categoria.COSMETICO.toString();
	
}

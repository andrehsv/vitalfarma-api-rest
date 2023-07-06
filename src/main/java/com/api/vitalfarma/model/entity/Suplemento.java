package com.api.vitalfarma.model.entity;

import org.hibernate.annotations.GenericGenerator;

import com.api.vitalfarma.model.Categoria;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "suplementos")
public class Suplemento {
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private long id;
	private String nome;
	private double preco;
	private String categoria = Categoria.SUPLEMENTO.toString();

}

package com.api.vitalfarma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.vitalfarma.model.dto.RemedioDTO;
import com.api.vitalfarma.model.entity.Remedio;
import com.api.vitalfarma.model.mapper.VitalfarmaMapper;
import com.api.vitalfarma.model.repository.RemedioRepository;

@Service
public class RemedioService {
	
	@Autowired
	private RemedioRepository repositorio;
	
	public List<RemedioDTO> mostrarTodos() {
		return VitalfarmaMapper.converterDe(repositorio.findAll(), RemedioDTO.class);
	}

	public RemedioDTO adicionar(RemedioDTO produto) {
		Remedio entidade = VitalfarmaMapper.converterDe(produto, Remedio.class);
		RemedioDTO dto = VitalfarmaMapper.converterDe(repositorio.save(entidade), RemedioDTO.class);
		return dto;
	}

}

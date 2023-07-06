package com.api.vitalfarma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.vitalfarma.model.dto.SuplementoDTO;
import com.api.vitalfarma.model.entity.Suplemento;
import com.api.vitalfarma.model.mapper.VitalfarmaMapper;
import com.api.vitalfarma.model.repository.SuplementoRepository;

@Service
public class SuplementoService {
	
	@Autowired
	private SuplementoRepository repositorio;
	
	public List<SuplementoDTO> mostrarTodos() {
		return VitalfarmaMapper.converterDe(repositorio.findAll(), SuplementoDTO.class);
	}

	public SuplementoDTO adicionar(SuplementoDTO produto) {
		Suplemento entidade = VitalfarmaMapper.converterDe(produto, Suplemento.class);
		SuplementoDTO dto = VitalfarmaMapper.converterDe(repositorio.save(entidade), SuplementoDTO.class);
		return dto;
	}

}

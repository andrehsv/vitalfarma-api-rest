package com.api.vitalfarma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.vitalfarma.model.dto.CosmeticoDTO;
import com.api.vitalfarma.model.entity.Cosmetico;
import com.api.vitalfarma.model.mapper.VitalfarmaMapper;
import com.api.vitalfarma.model.repository.CosmeticoRepository;

@Service
public class CosmeticoService {
	
	@Autowired
	private CosmeticoRepository repositorio;
	
	public List<CosmeticoDTO> mostrarTodos() {
		return VitalfarmaMapper.converterDe(repositorio.findAll(), CosmeticoDTO.class);
	}

	public CosmeticoDTO adicionar(CosmeticoDTO produto) {
		Cosmetico entidade = VitalfarmaMapper.converterDe(produto, Cosmetico.class);
		CosmeticoDTO dto = VitalfarmaMapper.converterDe(repositorio.save(entidade), CosmeticoDTO.class);
		return dto;
	}

}

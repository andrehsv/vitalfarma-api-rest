package com.api.vitalfarma.model.mapper;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

public class VitalfarmaMapper {
	
	private static ModelMapper mapper = new ModelMapper();
	
	public static <O, D> D converterDe(O origem, Class<D> destino) {
		return mapper.map(origem, destino);
	}
	
	public static <O, D> List<D> converterDe(List<O> origem, Class<D> destino) {
		List<D> destinoLista = new ArrayList<>();
		origem.forEach(objeto -> destinoLista.add(converterDe(objeto, destino)));
		return destinoLista;
	}

}

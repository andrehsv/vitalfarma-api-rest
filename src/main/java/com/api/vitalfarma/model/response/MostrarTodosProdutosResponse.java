package com.api.vitalfarma.model.response;

import java.util.List;

import com.api.vitalfarma.model.dto.CosmeticoDTO;
import com.api.vitalfarma.model.dto.RemedioDTO;
import com.api.vitalfarma.model.dto.SuplementoDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MostrarTodosProdutosResponse {
	private List<RemedioDTO> listaRemedios;
	private List<SuplementoDTO> listaSuplementos;
	private List<CosmeticoDTO> listaCosmeticos;
}

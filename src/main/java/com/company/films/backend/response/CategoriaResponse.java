package com.company.films.backend.response;

import java.util.List;

import com.company.films.backend.model.Categoria;

public class CategoriaResponse {
	private List<Categoria> categoria;

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}
	
}

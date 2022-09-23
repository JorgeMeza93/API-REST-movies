package com.company.films.backend.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.films.backend.response.CategoriaResponseRest;
import com.company.films.backend.service.ICategoriaService;

@RestController
@RequestMapping("/v1")
public class CategoriaRestController {
	@Autowired
	private ICategoriaService service;
	@GetMapping("/categorias")
	public CategoriaResponseRest categorias(){
		CategoriaResponseRest response = service.buscarCategorias();
		return response;
	}
	
}

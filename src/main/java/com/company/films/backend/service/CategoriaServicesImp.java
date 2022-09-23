package com.company.films.backend.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.films.backend.model.Categoria;
import com.company.films.backend.model.dao.ICategoriaDao;
import com.company.films.backend.response.CategoriaResponseRest;

@Service
public class CategoriaServicesImp implements ICategoriaService{
	private static final Logger log = LoggerFactory.getLogger(CategoriaServicesImp.class);
	@Autowired
	private ICategoriaDao categoriaDao;
	@Transactional(readOnly = true)
	@Override
	public CategoriaResponseRest buscarCategorias() {
		log.info("Iniciando método buscarCategorias");
		CategoriaResponseRest response = new CategoriaResponseRest();
		try {
			List<Categoria> categorias = (List<Categoria>)categoriaDao.findAll();
			response.getCategoriaResponse().setCategoria(categorias);
			response.setMetadata("Respuesta Ok", "00", "Respuesta éxitosa");
		} catch (Exception e) {
			response.setMetadata("Respuesta no ok", "-1", "Respuesta no exitosa");
			log.error("Error al consultar categoria ", e.getMessage());
			e.getStackTrace();
		}
		return response;
	}

}

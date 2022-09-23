package com.company.films.backend.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.company.films.backend.model.Categoria;

public interface ICategoriaDao extends CrudRepository<Categoria, Long>{

}

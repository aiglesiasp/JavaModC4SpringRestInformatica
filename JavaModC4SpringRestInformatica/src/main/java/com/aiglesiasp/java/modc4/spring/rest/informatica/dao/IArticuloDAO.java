package com.aiglesiasp.java.modc4.spring.rest.informatica.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.java.modc4.spring.rest.informatica.dto.Articulo;


public interface IArticuloDAO extends JpaRepository<Articulo, Integer>{

	// Listar articulos por campo title
		public List<Articulo> findByTitle(String title);
}

/**
 * 
 */
package com.aiglesiasp.java.modc4.spring.rest.informatica.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.java.modc4.spring.rest.informatica.dto.Fabricante;

/**
 * @author aitor
 *
 */
public interface IFabricanteDAO extends JpaRepository<Fabricante, Integer>{

	// Listar fabricantes por campo nombre
			public List<Fabricante> findByNombre(String nombre);
}

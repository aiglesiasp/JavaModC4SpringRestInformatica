/**
 * 
 */
package com.aiglesiasp.java.modc4.spring.rest.informatica.service;

import java.util.List;

import com.aiglesiasp.java.modc4.spring.rest.informatica.dto.Articulo;

/**
 * @author aitor
 *
 */
public interface IArticuloService {
	//Metodos del CRUD
			public List<Articulo> listarArticulos(); //Listar All 
			
			public Articulo guardarArticulo(Articulo articulo);	//Guarda un articulo CREATE
			
			public Articulo articuloById(int codigo); //Leer datos de un articulo READ
			
			public Articulo actualizarArticulo(Articulo articulo); //Actualiza datos del articulo UPDATE
			
			public void eliminarArticulo(int codigo);// Elimina el articulo DELETE

}

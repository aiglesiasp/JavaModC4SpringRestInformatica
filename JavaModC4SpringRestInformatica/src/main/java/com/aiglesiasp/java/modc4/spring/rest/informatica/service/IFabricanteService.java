/**
 * 
 */
package com.aiglesiasp.java.modc4.spring.rest.informatica.service;

import java.util.List;

import com.aiglesiasp.java.modc4.spring.rest.informatica.dto.Fabricante;

/**
 * @author aitor
 *
 */
public interface IFabricanteService {
	//Metodos del CRUD
		public List<Fabricante> listarFabricantes(); //Listar All 
		
		public Fabricante guardarFabricante(Fabricante fabricante);	//Guarda un fabricante CREATE
		
		public Fabricante fabricanteById(int codigo); //Leer datos de un fabricante READ
		
		public Fabricante actualizarFabricante(Fabricante fabricante); //Actualiza datos del fabricante UPDATE
		
		public void eliminarFabricante(int codigo);// Elimina el fabricante DELETE
}

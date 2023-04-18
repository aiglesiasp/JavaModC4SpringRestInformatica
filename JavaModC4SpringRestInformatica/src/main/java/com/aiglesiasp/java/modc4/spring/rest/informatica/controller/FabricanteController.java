/**
 * 
 */
package com.aiglesiasp.java.modc4.spring.rest.informatica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiglesiasp.java.modc4.spring.rest.informatica.dto.Fabricante;
import com.aiglesiasp.java.modc4.spring.rest.informatica.service.FabricanteServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes(){
		return fabricanteServiceImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricantes")
	public Fabricante salvarFabricantes(@RequestBody Fabricante fabricante) {
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricantes/{codigo}")
	public Fabricante fabricanteById(@PathVariable(name="codigo") int codigo) {
		Fabricante fabricante= new Fabricante();
		fabricante=fabricanteServiceImpl.fabricanteById(codigo);
		System.out.println("Fabricante By ID: "+fabricante);
		return fabricante;
	}
	
	@PutMapping("/fabricantes/{codigo}")
	public Fabricante actualizarFabricante(@PathVariable(name="codigo")int codigo,@RequestBody Fabricante fabricante) {
		
		Fabricante fabricante_seleccionado= new Fabricante();
		Fabricante fabricante_actualizado= new Fabricante();
		fabricante_seleccionado= fabricanteServiceImpl.fabricanteById(codigo);
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		fabricante_actualizado = fabricanteServiceImpl.actualizarFabricante(fabricante_seleccionado);
		System.out.println("El cliente actualizado es: "+ fabricante_actualizado);
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{codigo}")
	public void eliminarCliente(@PathVariable(name="codigo")int codigo) {
		fabricanteServiceImpl.eliminarFabricante(codigo);
	}

}

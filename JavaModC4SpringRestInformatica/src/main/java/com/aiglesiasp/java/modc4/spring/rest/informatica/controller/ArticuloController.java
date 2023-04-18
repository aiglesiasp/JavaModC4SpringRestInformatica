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

import com.aiglesiasp.java.modc4.spring.rest.informatica.dto.Articulo;
import com.aiglesiasp.java.modc4.spring.rest.informatica.dto.Fabricante;
import com.aiglesiasp.java.modc4.spring.rest.informatica.service.ArticuloServiceImpl;
import com.aiglesiasp.java.modc4.spring.rest.informatica.service.FabricanteServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class ArticuloController {
	
	@Autowired
	ArticuloServiceImpl articuloServiceImpl;;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return articuloServiceImpl.listarArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulo salvarArticulos(@RequestBody Articulo articulo) {
		return articuloServiceImpl.guardarArticulo(articulo);
	}
	
	@GetMapping("/articulos/{codigo}")
	public Articulo articuloById(@PathVariable(name="codigo") int codigo) {
		Articulo articulo= new Articulo();
		articulo=articuloServiceImpl.articuloById(codigo);
		System.out.println("Fabricante By ID: "+articulo);
		return articulo;
	}
	
	@PutMapping("/articulos/{codigo}")
	public Articulo actualizarArticulo(@PathVariable(name="codigo")int codigo,@RequestBody Articulo articulo) {
		
		Articulo articulo_seleccionado= new Articulo();
		Articulo articulo_actualizado= new Articulo();
		articulo_seleccionado= articuloServiceImpl.articuloById(codigo);
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante(articulo.getFabricante());
		
		articulo_actualizado = articuloServiceImpl.actualizarArticulo(articulo_seleccionado);
		System.out.println("El cliente actualizado es: "+ articulo_actualizado);
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{codigo}")
	public void eliminarArticulo(@PathVariable(name="codigo")int codigo) {
		articuloServiceImpl.eliminarArticulo(codigo);
	}

}

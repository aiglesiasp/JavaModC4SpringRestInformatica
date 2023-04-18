/**
 * 
 */
package com.aiglesiasp.java.modc4.spring.rest.informatica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.java.modc4.spring.rest.informatica.dao.IArticuloDAO;
import com.aiglesiasp.java.modc4.spring.rest.informatica.dto.Articulo;

/**
 * @author aitor
 *
 */
@Service
public class ArticuloServiceImpl implements IArticuloService{
	@Autowired
	IArticuloDAO iArticuloDAO;

	@Override
	public List<Articulo> listarArticulos() {
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulo articuloById(int codigo) {
		return iArticuloDAO.findById(codigo).get();
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(int codigo) {
		iArticuloDAO.deleteById(codigo);
		
	}

}

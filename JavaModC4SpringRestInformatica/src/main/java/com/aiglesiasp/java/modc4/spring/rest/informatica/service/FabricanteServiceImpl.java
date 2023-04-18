/**
 * 
 */
package com.aiglesiasp.java.modc4.spring.rest.informatica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.java.modc4.spring.rest.informatica.dao.IFabricanteDAO;
import com.aiglesiasp.java.modc4.spring.rest.informatica.dto.Fabricante;

/**
 * @author aitor
 *
 */
@Service
public class FabricanteServiceImpl implements IFabricanteService {

	@Autowired
	IFabricanteDAO iFabricanteDAO;
	
	@Override
	public List<Fabricante> listarFabricantes() {
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante fabricanteById(int codigo) {
		return iFabricanteDAO.findById(codigo).get();
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(int codigo) {
		iFabricanteDAO.deleteById(codigo);
		
	}

}

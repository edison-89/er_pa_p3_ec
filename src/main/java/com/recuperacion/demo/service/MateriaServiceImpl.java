package com.recuperacion.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recuperacion.demo.repo.IMateriaRepo;
import com.recuperacion.demo.repo.modelo.Materia;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepo materiaRepo;

	@Override
	public void insertar(Materia materia) {
		materia.setNumeroEstudiantes(0);
		this.materiaRepo.insertar(materia);
	}

}

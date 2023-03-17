package com.recuperacion.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recuperacion.demo.repo.IEstudianteRepo;
import com.recuperacion.demo.repo.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepo estudianteRepo;

	@Override
	public void insertar(Estudiante estudiante) {
		this.estudianteRepo.insertar(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		this.estudianteRepo.eliminar(id);
	}

	@Override
	public List<Estudiante> buscarTodos() {
		return this.estudianteRepo.buscarTodos();
	}

}

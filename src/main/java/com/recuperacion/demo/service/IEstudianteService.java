package com.recuperacion.demo.service;

import java.util.List;

import com.recuperacion.demo.repo.modelo.Estudiante;

public interface IEstudianteService {

	public void insertar(Estudiante estudiante);

	public void eliminar(Integer id);

	public List<Estudiante> buscarTodos();

}

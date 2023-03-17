package com.recuperacion.demo.repo;

import java.util.List;

import com.recuperacion.demo.repo.modelo.Estudiante;

public interface IEstudianteRepo {

	public void insertar(Estudiante estudiante);

	public void eliminar(Integer id);

	public Estudiante buscar(Integer id);

	// Para ver la lista de los estudiantes
	public List<Estudiante> buscarTodos();
	
	
	public Estudiante buscarPorCedula(String cedula);
	


}

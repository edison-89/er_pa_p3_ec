package com.recuperacion.demo.repo;

import com.recuperacion.demo.repo.modelo.Materia;

public interface IMateriaRepo {

	public void insertar(Materia materia);
	
	public void actualizar(Materia materia);

	public Materia buscarPorCodigo(String codigo);

}

package com.recuperacion.demo.repo;

import java.util.List;

import com.recuperacion.demo.repo.modelo.Matricula;
import com.recuperacion.demo.repo.modelo.dto.MatriculaDTO;

public interface IMatriculaRepo {

	public void insertar(Matricula matricula);

	public List<MatriculaDTO> buscarTodos();

}

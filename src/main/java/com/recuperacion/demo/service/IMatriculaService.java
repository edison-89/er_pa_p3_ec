package com.recuperacion.demo.service;

import java.util.List;

import com.recuperacion.demo.repo.modelo.Matricula;
import com.recuperacion.demo.repo.modelo.dto.MatriculaDTO;

public interface IMatriculaService {

	public void realizar(Matricula matricula);

	public List<MatriculaDTO> buscarTodos();

}

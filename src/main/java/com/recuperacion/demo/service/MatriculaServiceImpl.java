package com.recuperacion.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recuperacion.demo.repo.IEstudianteRepo;
import com.recuperacion.demo.repo.IMateriaRepo;
import com.recuperacion.demo.repo.IMatriculaRepo;
import com.recuperacion.demo.repo.modelo.Estudiante;
import com.recuperacion.demo.repo.modelo.Materia;
import com.recuperacion.demo.repo.modelo.Matricula;
import com.recuperacion.demo.repo.modelo.dto.MatriculaDTO;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepo matriculaRepo;

	@Autowired
	private IMateriaRepo materiaRepo;

	@Autowired
	private IEstudianteRepo estudianteRepo;

	@Override
	public void realizar(Matricula matricula) {
		Materia materia = this.materiaRepo.buscarPorCodigo(matricula.getMateria().getCodigo());
		Estudiante estudiante = this.estudianteRepo.buscarPorCedula(matricula.getEstudiante().getCedula());

		matricula.setMateria(materia);
		matricula.setEstudiante(estudiante);
		this.matriculaRepo.insertar(matricula);

		materia.setNumeroEstudiantes(materia.getNumeroEstudiantes() + 1);
		this.materiaRepo.actualizar(materia);
	}

	@Override
	public List<MatriculaDTO> buscarTodos() {
		return this.matriculaRepo.buscarTodos();
	}

}

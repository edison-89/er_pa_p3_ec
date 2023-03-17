package com.recuperacion.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.recuperacion.demo.repo.modelo.Matricula;
import com.recuperacion.demo.repo.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Matricula matricula) {
		this.entityManager.persist(matricula);
	}

	@Override
	public List<MatriculaDTO> buscarTodos() {
		TypedQuery<MatriculaDTO> myTypedQuery = this.entityManager.createQuery(
				"SELECT NEW com.recuperacion.demo.repo.modelo.dto.MatriculaDTO(m.estudiante.cedula, m.estudiante.nombre, m.estudiante.apellido, m.materia.nombre, m.materia.codigo) FROM Matricula m",
				MatriculaDTO.class);
		return myTypedQuery.getResultList();
	}

}

package com.recuperacion.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.recuperacion.demo.repo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		Estudiante estu = this.buscar(id);
		this.entityManager.remove(estu);
	}

	@Override
	public Estudiante buscar(Integer id) {
		return this.entityManager.find(Estudiante.class, id);

	}

	@Override
	public List<Estudiante> buscarTodos() {
		TypedQuery<Estudiante> query = this.entityManager.createQuery("SELECT e FROM Estudiante e", Estudiante.class);
		return query.getResultList();
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		TypedQuery<Estudiante> query = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.cedula =:cedula", Estudiante.class);
		query.setParameter("cedula", cedula);
		return query.getResultList().get(0);
	}
}

package com.recuperacion.demo.repo.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matri_seq")
	@SequenceGenerator(name = "matri_seq", sequenceName = "matri_seq", allocationSize = 1)
	@Column(name = "matri_id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "matri_id_estudiante")
	private Estudiante estudiante;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "matri_id_materia")
	private Materia materia;

	// Metodos SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

}

package com.recuperacion.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.recuperacion.demo.repo.modelo.Estudiante;
import com.recuperacion.demo.service.IEstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {

	@Autowired
	private IEstudianteService estudianteService;

	@GetMapping("/nuevoEstudiante")
	public String paginaNuevoEstudiante(Estudiante estudiante) {
		return "vistaNuevoEstudiante";
	}

	@PostMapping("/insertar")
	public String insertarMateria(Estudiante estudiante) {
		this.estudianteService.insertar(estudiante);
		return "redirect:/estudiantes/buscar";
	}

	@GetMapping("/buscar")
	public String buscarTodos(Model modelo) {
		List<Estudiante> lista = this.estudianteService.buscarTodos();
		modelo.addAttribute("estudiantes", lista);
		return "vistaListaEstudiantes";
	}

	@DeleteMapping("/borrar/{id}")
	public String borrarEstudiante(@PathVariable("id") Integer id) {
		this.estudianteService.eliminar(id);
		return "redirect:/estudiantes/buscar";
	}

}

package com.recuperacion.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.recuperacion.demo.repo.modelo.Matricula;
import com.recuperacion.demo.repo.modelo.dto.MatriculaDTO;
import com.recuperacion.demo.service.IMatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {

	@Autowired
	private IMatriculaService matriculaService;

	@GetMapping("/nuevaMatricula")
	public String paginaNuevaMatricula(Matricula matricula) {
		return "vistaNuevaMatricula";
	}

	@PostMapping("/insertar")
	public String insertarMatricula(Matricula matricula) {
		this.matriculaService.realizar(matricula);
		return "redirect:/matriculas/buscar";
	}

	@GetMapping("/buscar")
	public String buscarTodos(Model modelo) {
		List<MatriculaDTO> lista = this.matriculaService.buscarTodos();
		modelo.addAttribute("matriculas", lista);
		return "vistaListaMatriculas";
	}

}

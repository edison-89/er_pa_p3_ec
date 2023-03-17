package com.recuperacion.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.recuperacion.demo.repo.modelo.Materia;
import com.recuperacion.demo.service.IMateriaService;

@Controller
@RequestMapping("/materias")
public class MateriaController {

	@Autowired
	private IMateriaService materiaSer;

	@GetMapping("/nuevaMateria")
	public String paginaNuevaMateria(Materia materia) {
		return "vistaNuevaMateria";
	}

	@PostMapping("/insertar")
	public String insertarMateria(Materia materia) {
		this.materiaSer.insertar(materia);
		return "redirect:/materias/nuevaMateria";
	}

}

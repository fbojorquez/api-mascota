package com.veterinaria.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.model.Mascota;
import com.veterinaria.service.MascotaService;
@RestController
@RequestMapping("/mascota")
public class MascotaController {
	@Autowired
	MascotaService mascotaService;
	
	@GetMapping("")
	public List<Mascota> getMascotas(){
		return mascotaService.getMascotas();
	}

	@GetMapping("/{id}")
	public Mascota getMascota(@PathVariable("id")Long id){
		return mascotaService.getMascota(id);		
	}
	
	@PostMapping(value = "")
	public Map<String, Object> createMascota(@RequestParam(value = "id") Long id, 
			@RequestParam(value = "nombre") String nombre, @RequestParam(value="nombre_raza") String nombre_raza,
			@RequestParam(value = "anios") Integer anios) {
		mascotaService.createMascota(id, nombre, nombre_raza, anios);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", "mascota added!");
		return map;
	}
}

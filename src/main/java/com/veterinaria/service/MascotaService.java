package com.veterinaria.service;

import java.util.List;

import com.veterinaria.model.Mascota;

public interface MascotaService {
	public List<Mascota> getMascotas();
	public Mascota getMascota(Long id);
	public void createMascota(Long id, String nombre, String nombre_raza, Integer anios);
}

package com.veterinaria.service.Impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.veterinaria.model.Mascota;
import com.veterinaria.service.MascotaService;

@Service
public class MascotatServiceImpl implements MascotaService {
	
	public MascotatServiceImpl() {
		mascotas.add(new Mascota(1L,"dandy", "corriente", 2));
		mascotas.add(new Mascota(2L,"","",1));
	}
	
	List<Mascota> mascotas = new ArrayList<Mascota>();

	public List<Mascota> getMascotas() {		
		return mascotas;
	}
		
	public Mascota getMascota(Long id) {
		Iterator<Mascota> iterator = mascotas.iterator();
		while (iterator.hasNext()) {
			Mascota mascota = iterator.next();
			if (mascota.getIdu().equals(id)) {
				return mascota;
			}
		}
		return null;
	}

	public void createMascota(Long id, String nombre, String nombre_raza, Integer anios) {
		mascotas.add(new Mascota(id, nombre, nombre_raza, anios));
		
	}

}

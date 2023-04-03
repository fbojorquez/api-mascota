package com.veterinaria.model;

public class Mascota {
		
	private Mascota() {
		super();
	}
	
	public Mascota(Long idu, String nombre, String nombre_raza, Integer edad) {
		super();
		this.idu = idu;
		this.nombre = nombre;
		this.nombre_raza = nombre_raza;
		this.edad = edad;
	}
		
	public Mascota(String nombre, String nombre_raza, Integer edad) {
		super();
		this.nombre = nombre;
		this.nombre_raza = nombre_raza;
		this.edad = edad;
	}


	private Long idu;
	private String nombre;
	private String nombre_raza;
	private Integer edad;
	public Long getIdu() {
		return idu;
	}
	
	public void setIdu(Long idu) {
		this.idu = idu;
	}
	
	public String getNombre() {
		return nombre;
		}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre_raza() {
		return nombre_raza;
	}
	
	public void setNombre_raza(String nombre_raza) {
		this.nombre_raza = nombre_raza;
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	
}

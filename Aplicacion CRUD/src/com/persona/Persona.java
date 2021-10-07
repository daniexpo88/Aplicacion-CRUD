package com.persona;

import java.time.LocalDate;

public class Persona {
	private int id;
	private String nombre;
	private LocalDate fechaNac;
	
	public Persona() {}
	
	public Persona(int id, String nombre, LocalDate fechaNac) {
		this.id=id;
		this.nombre=nombre;
		this.fechaNac=fechaNac;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNac() {
		return fechaNac.toString();
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", fechaNac=" + fechaNac.toString() + "]";
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
}

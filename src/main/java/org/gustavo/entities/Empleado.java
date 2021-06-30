package org.gustavo.entities;

/**
 * 
 * @author gustavo
 * Clase que representa entidades de empleados
 *
 */
public class Empleado {
	
	private String nombre, apellido1, apellido2, puesto;
	private boolean estatus;

	public Empleado() {}
	
	public Empleado(String nombre, String apellido1, String apellido2, String puesto, boolean estatus) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.puesto = puesto;
		this.estatus = estatus;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	

}

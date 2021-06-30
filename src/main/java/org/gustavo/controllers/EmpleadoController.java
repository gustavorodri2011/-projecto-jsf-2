/**
 * 
 */
package org.gustavo.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.gustavo.entities.Empleado;
import org.gustavo.services.EmpleadoService;

/**
 * @author gustavo
 *
 */

@ManagedBean
@ViewScoped
public class EmpleadoController {

	EmpleadoService service = new EmpleadoService();

	private List<Empleado> empleados;

	@PostConstruct
	public void init() {
		this.getAll();
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void getAll() {
		this.empleados = this.service.getAll();
	}

}

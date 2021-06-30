/**
 * 
 */
package org.gustavo.services;

import java.util.ArrayList;
import java.util.List;

import org.gustavo.entities.Empleado;

/**
 * @author gustavo
 *
 */
public class EmpleadoService {

	public List<Empleado> getAll() {
		List<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empIbm = new Empleado("Juan", "Gomez", "Perez", "Gerente de Proyectos", true);
		Empleado empMicrosoft = new Empleado("Carlos", "Vigliola", "Fernandez", "Programador", false);
		Empleado empApple = new Empleado("Cristina", "Martinez", "Puig", "Ingeniero de procesos", true);

		empleados.add(empIbm);
		empleados.add(empMicrosoft);
		empleados.add(empApple);

		return empleados;
	}
}

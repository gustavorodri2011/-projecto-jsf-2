/**
 * 
 */
package org.gustavo.controllers;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.gustavo.entities.Empleado;
import org.gustavo.services.EmpleadoService;

/**
 * @author gustavo
 *
 */

@ManagedBean
@ViewScoped
public class EmpleadoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	EmpleadoService service = new EmpleadoService();

	private List<Empleado> empleados;

	private List<Empleado> empleadosFiltrados;

	public List<Empleado> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}

	public void setEmpleadosFiltrados(List<Empleado> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}

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
	
	public void postProcessXLS(Object document) {
        HSSFWorkbook wb = (HSSFWorkbook) document;
        HSSFSheet sheet = wb.getSheetAt(0);
        CellStyle style = wb.createCellStyle();
        style.setFillBackgroundColor(IndexedColors.AQUA.getIndex());

        for (Row row : sheet) {
            for (Cell cell : row) {
                cell.setCellValue(cell.getStringCellValue().toUpperCase());
                cell.setCellStyle(style);
            }
        }
        
        FacesContext.getCurrentInstance().responseComplete();
    }

}

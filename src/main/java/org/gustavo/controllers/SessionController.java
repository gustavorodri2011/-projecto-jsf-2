/**
 * 
 */
package org.gustavo.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.gustavo.dto.UsuarioDto;

/**
 * @author gustavo
 * Clase controladora que mantiene los datos del usuario que tiene 
 * sesion iniciada
 */
@ManagedBean
@SessionScoped
public class SessionController {
	
	private UsuarioDto usuarioDto;

	public UsuarioDto getUsuarioDto() {
		return usuarioDto;
	}

	public void setUsuarioDto(UsuarioDto usuarioDto) {
		this.usuarioDto = usuarioDto;
	}
	
	/**
	 * Inicializa la sesion de usuario
	 */
	
	@PostConstruct
	private void init() {
		System.out.println("Cargando información del usurio en la sesion...");

	}
}

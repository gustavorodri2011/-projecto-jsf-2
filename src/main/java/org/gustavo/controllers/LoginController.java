/**
 * 
 */
package org.gustavo.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author gustavo
 *
 */
@ManagedBean
public class LoginController {

	private String username = "admin";
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * Metodo para ingresar al sistema Login
	 */
	public void ingresar() {
		if (getUsername().equalsIgnoreCase("admin") && getPassword().equalsIgnoreCase("admin")) {
			try {
				redirectToPage("inicio.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsername",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe.", ""));
				e.printStackTrace();
			}
			System.out.println("Ingreso exitoso desde el backend");
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsername", new FacesMessage(
					FacesMessage.SEVERITY_ERROR, "El Usuario y/o la Contraseña no son válidos.", ""));
			
			System.out.println("Fallo el usuario o la password desde el backend");
		}
	}

	private void redirectToPage(String page) throws IOException {
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		context.redirect(page);
	}
}

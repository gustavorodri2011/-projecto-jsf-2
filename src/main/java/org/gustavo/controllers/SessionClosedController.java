/**
 * 
 */
package org.gustavo.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author gustavo Controlador para cerrar la sesion de usuario
 */
@ManagedBean
public class SessionClosedController {

	@PostConstruct
	public void init() {
		System.out.println("cerrando sesion de usuario...");

	}

	public void closeSesion() {
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		context.invalidateSession();
		try {
			redirectToPage("login.xhtml");
		} catch (IOException e) {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsername",
					new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe.", ""));
			e.printStackTrace();
		}
	}

	private void redirectToPage(String page) throws IOException {
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		context.redirect(page);
	}

}

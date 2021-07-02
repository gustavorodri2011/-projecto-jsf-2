/**
 * 
 */
package org.gustavo.dto;

/**
 * @author gustavo Clase que peermitira contener la informacion del usuario en
 *         sesion.
 *
 */
public class UsuarioDto {
	private String usuario;
	private String password;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

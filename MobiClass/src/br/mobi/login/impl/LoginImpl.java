package br.mobi.login.impl;

import br.mobi.login.Login;

public class LoginImpl {

	/*
	 * FUnção tem objetivo fazer o login no sistema, devido ao tempo essa função não foi feita a persistencia no banco
	 */
	public Login fazerLogin(Login usuario) {
		Login login = null;

		if (usuario.getUsuario().equals("admin") && usuario.getSenha().equals("123456")){
			login = usuario;
		}else{
			login = null;
		}

		return login;
	}
}

package br.mobi.login;

import br.mobi.util.VoObject;

/*
 * Abstração da entidade Login (Usuario, Senha, nivel Acesso), objetivo persistir no banco de Dados
 */
public class Login extends VoObject<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String usuario;
	private String senha;

	public Login(){}

	public Login(String usu, String sen){
		this.usuario = usu;
		this.senha = sen;
	}

	@Override
	public String toString() {
		String login = "Login {usuario: '" + this.usuario + "', senha: '" + this.senha + "'}";
		return login;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override	
	public Integer getCod() {
		// TODO Auto-generated method stub
		return this.codigo;
	}

	@Override
	public void setCod(Integer cod) {
		this.codigo = codigo;	
	}


}

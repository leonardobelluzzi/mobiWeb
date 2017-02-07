package br.mobi.login;

import org.bson.Document;

import br.mobi.util.VoObject;

/*
 * Abstra��o da entidade Login (Usuario, Senha, nivel Acesso), objetivo persistir no banco de Dados
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
		this.setUsuario(usu);
		this.setSenha(sen);
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
		this.codigo = cod;	
	}

	@Override
	public Document toJason() {
		// TODO Auto-generated method stub
		return null;
	}


}

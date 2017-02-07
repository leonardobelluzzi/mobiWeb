package com.mobi.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.mobi.login.Login;
import br.mobi.login.impl.LoginImpl;
 
@ManagedBean
public class LoginBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String msgLoginErro = "Login ivalido !";
	private String esquecerSenha = "Essa função não foi implementada!";
	
	private String usuario;
	private String senha;
	
	
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

	/*public void login(){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning!", "Watch out for PrimeFaces."));
	}*/
	
	public String login() {
		Login usuario = new Login(this.usuario, this.senha);
		LoginImpl loginImpl = new LoginImpl();
		
		usuario = loginImpl.fazerLogin(usuario);
		
		if (usuario == null){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", msgLoginErro));
			return null;
		}else{
			FacesContext.getCurrentInstance().getAttributes().put("login", usuario);
			return "teste.xhtml";
		}
    }
	
	public String esquecerSenha(){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro" , "Função não implementada"));
		return null;
	}
	
}

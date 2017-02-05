package com.mobi.teste;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Teste implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String testeString = "Fazer Teste !";


	public String getTesteString() {
		return testeString;
	}


	public void setTesteString(String testeString) {
		this.testeString = testeString;
	}
}

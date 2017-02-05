package br.mobi.util;

import java.io.Serializable;

/*
 * Super classe entidade do projeto, objetivo super dos objetos do projeto
 */
public abstract class VoObject <T extends Number> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected T codigo;

	public abstract T getCod();
	public abstract void setCod(T cod);



}

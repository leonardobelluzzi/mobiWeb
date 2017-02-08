package br.mobi.util;

import java.io.Serializable;

import org.bson.Document;
import org.mongodb.morphia.annotations.Id;

/*
 * Super classe entidade do projeto, objetivo super dos objetos do projeto
 */
public abstract class VoObject <T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	protected T codigo;

	public abstract T getCod();
	public abstract void setCod(T cod);

}

package com.mobi.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.mobi.mercadoria.TipoMercadoria;

@ManagedBean
public class TipoMercadoriaBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final String sucessoInserir = "Tipo mercadoria foi inserida com sucesso!";
	private final String erroInserir = "Ocorreu um erro ao inserir tipo mercadoria: ";
	
	private List<TipoMercadoria> lista;
	private String nome_TipoMercadoria;
	
	
	public String getNome_TipoMercadoria() {
		return nome_TipoMercadoria;
	}
	
	public void setNome_TipoMercadoria(String nome_TipoMercadoria) {
		this.nome_TipoMercadoria = nome_TipoMercadoria;
	}

	
}

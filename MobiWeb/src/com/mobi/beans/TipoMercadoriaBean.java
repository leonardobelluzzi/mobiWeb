package com.mobi.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.mobi.mercadoria.tipo.TipoMercadoria;
import br.mobi.mercadoria.tipo.TipoMercadoriaImplementacao;

@ManagedBean
public class TipoMercadoriaBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final String sucessoInserir = "Sucesso: tipo mercadoria foi cadastrada!";
	private final String erroInserir = "Ocorreu um erro ao fazer o cadatro de tipo mercadoria: ";
	
	private List<TipoMercadoria> lista = new ArrayList<TipoMercadoria>();
	private TipoMercadoria tipoMercadoria = new TipoMercadoria();
	private String nomeTipoMercadoria;
	
	
	public String inserirTipoMercadoria(){
		TipoMercadoria tipomercadoria = new TipoMercadoria();
		tipomercadoria.setNome(this.getNomeTipoMercadoria());
		
		TipoMercadoriaImplementacao function = new TipoMercadoriaImplementacao(tipomercadoria);
		
		String inserir = function.inserir();
		
		if (inserir.isEmpty()){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", sucessoInserir));
		}else{
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", erroInserir));
		}
		
		
		/*
		 * Atualizar Lista
		 */
		function = new TipoMercadoriaImplementacao(this.tipoMercadoria);
		List<TipoMercadoria> listaTodos = function.listarTodos();
		this.setLista(listaTodos);
		
		return null;
	}


	public TipoMercadoria getTipoMercadoria() {
		return tipoMercadoria;
	}


	public void setTipoMercadoria(TipoMercadoria tipoMercadoria) {
		this.tipoMercadoria = tipoMercadoria;
	}


	public List<TipoMercadoria> getLista() {
		TipoMercadoriaImplementacao function = new TipoMercadoriaImplementacao(this.tipoMercadoria);
		List<TipoMercadoria> listaTodos = function.listarTodos();
		
		return listaTodos;
	}


	public void setLista(List<TipoMercadoria> lista) {
		this.lista = lista;
	}


	public String getNomeTipoMercadoria() {
		return nomeTipoMercadoria;
	}


	public void setNomeTipoMercadoria(String nomeTipoMercadoria) {
		this.nomeTipoMercadoria = nomeTipoMercadoria;
	}
	
	
}

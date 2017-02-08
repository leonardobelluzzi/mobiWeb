package com.mobi.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.mongodb.morphia.annotations.Embedded;

import br.mobi.mercadoria.Mercadoria;
import br.mobi.mercadoria.tipo.TipoMercadoria;
import br.mobi.util.TipoNegocio;

@ManagedBean
public class MercadoriaBean implements Serializable{

	private String nome;
	private Integer quantidade;
	private double preco;
	private List<Mercadoria> lista;
	private TipoNegocio tipoNegocio;
	private TipoMercadoria tipoMercadoria;


	public String inserir(){
		return null;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public List<Mercadoria> getLista() {
		return lista;
	}


	public void setLista(List<Mercadoria> lista) {
		this.lista = lista;
	}


	public TipoNegocio getTipoNegocio() {
		return tipoNegocio;
	}


	public void setTipoNegocio(TipoNegocio tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}


	public TipoMercadoria getTipoMercadoria() {
		return tipoMercadoria;
	}


	public void setTipoMercadoria(TipoMercadoria tipoMercadoria) {
		this.tipoMercadoria = tipoMercadoria;
	}

}

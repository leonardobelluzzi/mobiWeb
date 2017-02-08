package com.mobi.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.mobi.mercadoria.Mercadoria;
import br.mobi.mercadoria.MercadoriaImplementacao;
import br.mobi.util.TipoNegocio;

@ManagedBean
public class MercadoriaBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Mercadoria mercadoria;

	private String nome = "";
	private Integer quantidade = 0;
	private double preco = 0.0;
	private List<Mercadoria> lista;
	private TipoNegocio tipoNegocio;
	
	private List<String> tipoMercadoria;

	private List<TipoNegocio> arrayTipoNegocio = new ArrayList<TipoNegocio>();


	private final String sucessoInserir = "Sucesso: Mercadoria foi cadastrada!";
	private final String erroInserir = "Ocorreu um erro ao fazer o cadatro de Mercadoria: ";

	@PostConstruct
	public void init() {
		this.arrayTipoNegocio.add(TipoNegocio.COMPRA);
		this.arrayTipoNegocio.add(TipoNegocio.VENDA);
		
		MercadoriaImplementacao function = new MercadoriaImplementacao(this.mercadoria);
		this.setLista(function.listarTodos());


	}

	public String inserir(){

		Mercadoria mercadoria = new Mercadoria();

		mercadoria.setNome(this.nome);
		mercadoria.setQuantidade(this.quantidade);
		mercadoria.setPreco(this.preco);
		mercadoria.setTipoMercadoria(tipoMercadoria);
		mercadoria.setTipoNegocio(tipoNegocio);

		MercadoriaImplementacao function = new MercadoriaImplementacao(mercadoria);

		String inserir = function.inserir();

		if (inserir.isEmpty()){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", sucessoInserir));
		}else{
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", erroInserir));
		}

		function = new MercadoriaImplementacao(this.mercadoria);
		this.setLista(function.listarTodos());

		return inserir;
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
		
		return this.lista;
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

	public List<String> getTipoMercadoria() {
		return tipoMercadoria;
	}

	public void setTipoMercadoria(List<String> tipoMercadoria) {
		this.tipoMercadoria = tipoMercadoria;
	}

	public List<TipoNegocio> getArrayTipoNegocio() {
		
		return arrayTipoNegocio;
	}

	public void setArrayTipoNegocio(List<TipoNegocio> arrayTipoNegocio) {
		this.arrayTipoNegocio = arrayTipoNegocio;
	}


}

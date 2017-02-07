package br.mobi.mercadoria;

import org.bson.Document;

import br.mobi.util.TipoNegocio;
import br.mobi.util.VoObject;

public class Mercadoria extends VoObject<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Integer quantidade;
	private Double preco;
	private TipoNegocio tipoNegocio;
	private String imgPath;
	
	public Mercadoria(){
		this.setQuantidade(0);
		this.setPreco(0.0);
	}
	
	public Mercadoria(String nome, Integer quantidade, Double preco, TipoNegocio tipoNegocio, String imgPath) {
		// TODO Auto-generated constructor stub]
		this.setNome(nome);
		this.setQuantidade(quantidade);
		this.setPreco(preco);
		this.setTipoNegocio(tipoNegocio);
		this.setImgPath(imgPath);
	}

	@Override
	public Long getCod() {
		// TODO Auto-generated method stub
		return this.codigo;
	}

	@Override
	public void setCod(Long cod) {
		// TODO Auto-generated method stub
		this.codigo = cod;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public TipoNegocio getTipoNegocio() {
		return tipoNegocio;
	}

	public void setTipoNegocio(TipoNegocio tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	@Override
	public Document toJason() {
		// TODO Auto-generated method stub
		return null;
	}

}

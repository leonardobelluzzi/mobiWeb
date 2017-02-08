package br.mobi.mercadoria;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;

import br.mobi.mercadoria.tipo.TipoMercadoria;
import br.mobi.util.TipoNegocio;
import br.mobi.util.VoObject;

@Entity("mercadoria")
public class Mercadoria extends VoObject<ObjectId>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Integer quantidade;
	private double preco;
	
	@Embedded
	private TipoNegocio tipoNegocio;
	
	@Embedded
	private List<String> tipoMercadoria;


	public Mercadoria(){}
	
	@Override
	public String toString() {
		String tostring = this.getNome();
		return tostring;
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

	@Override
	public ObjectId getCod() {
		// TODO Auto-generated method stub
		return this.codigo;
	}

	@Override
	public void setCod(ObjectId cod) {
		// TODO Auto-generated method stub
		this.codigo = cod;
	}
}

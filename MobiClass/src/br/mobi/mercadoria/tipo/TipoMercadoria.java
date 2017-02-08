package br.mobi.mercadoria.tipo;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;

import br.mobi.util.VoObject;

@Entity("tipomercadoria")
public class TipoMercadoria extends VoObject<ObjectId>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	public TipoMercadoria() {
		// TODO Auto-generated constructor stub
	}
	
	public TipoMercadoria (ObjectId id, String nome){
		this.setCod(id);
		this.setNome(nome);
	}
	
	@Override
	public String toString() {
		String tostring = this.getNome();
		return tostring;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

package com.mobi;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import br.mobi.mercadoria.tipo.TipoMercadoria;

@ManagedBean
public class MercadoriaBean implements Serializable{
	
	private TipoMercadoria tipoMercadoria;

	public TipoMercadoria getTipoMercadoria() {
		return tipoMercadoria;
	}

	public void setTipoMercadoria(TipoMercadoria tipoMercadoria) {
		this.tipoMercadoria = tipoMercadoria;
	}
}

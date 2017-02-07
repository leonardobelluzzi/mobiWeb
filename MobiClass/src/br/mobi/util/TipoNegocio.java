package br.mobi.util;

public enum TipoNegocio {

	COMPRA(1), VENDA(2);
	
	private Integer codigo;
	
	private TipoNegocio (Integer cod){
		this.setCodigo(cod);
	}

	public Integer getCodigo() {
		return codigo;
	}

	private void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
}

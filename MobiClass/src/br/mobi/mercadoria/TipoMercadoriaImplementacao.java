package br.mobi.mercadoria;

import java.util.List;

import org.mongodb.morphia.query.QueryResults;

import br.mobi.banco.MorphiaService;

public class TipoMercadoriaImplementacao {

	private MorphiaService morphiaService;
	private TipoMercadoriaFunction tmDAO;
	private TipoMercadoria tipoMercarodia;

	public TipoMercadoriaImplementacao(TipoMercadoria tipomercadoria){
		this.morphiaService = new MorphiaService();
		this.tmDAO = new TipoMercadoriaImpl(TipoMercadoria.class, morphiaService.getDatastore());
		this.tipoMercarodia = tipomercadoria;
	}

	public String inserir(){
		String inserir = "";
		try{
			tmDAO.save(this.tipoMercarodia);
			inserir = "";
		}catch (Exception e) {
			// TODO: handle exception
			inserir = e.getMessage();
		}

		return inserir;
	}

	public List<TipoMercadoria> listarTodos(){		
		QueryResults<TipoMercadoria> qr = tmDAO.find();

		return qr.asList();
	}
}

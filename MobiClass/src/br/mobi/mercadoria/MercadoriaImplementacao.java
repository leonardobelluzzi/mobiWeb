package br.mobi.mercadoria;

import java.util.List;

import org.mongodb.morphia.query.QueryResults;

import br.mobi.banco.MorphiaService;

public class MercadoriaImplementacao {
	
	private MorphiaService morphiaService;
	private MercadoriaFunction tmDAO;
	private Mercadoria mercarodia;

	public MercadoriaImplementacao(Mercadoria mercadoria){
		this.morphiaService = new MorphiaService();
		this.tmDAO = new MercadoriaImpl(Mercadoria.class, morphiaService.getDatastore());
		this.mercarodia = mercadoria;
	}

	public String inserir(){
		String inserir = "";
		try{
			tmDAO.save(this.mercarodia);
			inserir = "";
		}catch (Exception e) {
			// TODO: handle exception
			inserir = e.getMessage();
		}

		return inserir;
	}

	public List<Mercadoria> listarTodos(){		
		QueryResults<Mercadoria> qr = tmDAO.find();

		return qr.asList();
	}
}

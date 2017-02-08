package br.mobi.mercadoria;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

import br.mobi.mercadoria.tipo.TipoMercadoria;
import br.mobi.mercadoria.tipo.TipoMercadoriaFunction;

public class MercadoriaImpl extends BasicDAO<Mercadoria, ObjectId> implements MercadoriaFunction{

	public MercadoriaImpl(Class<Mercadoria> entityClass, Datastore ds) {
		super(entityClass, ds);		
		// TODO Auto-generated constructor stub
	}

}

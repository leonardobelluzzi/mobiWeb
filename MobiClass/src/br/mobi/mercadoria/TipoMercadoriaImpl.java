package br.mobi.mercadoria;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

public class TipoMercadoriaImpl extends BasicDAO<TipoMercadoria, ObjectId> implements TipoMercadoriaFunction{

	public TipoMercadoriaImpl(Class<TipoMercadoria> entityClass, Datastore ds) {
		super(entityClass, ds);		
		// TODO Auto-generated constructor stub
	}

}

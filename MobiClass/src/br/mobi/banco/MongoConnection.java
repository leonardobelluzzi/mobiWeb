package br.mobi.banco;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.codecs.DocumentCodec;
import org.bson.codecs.EncoderContext;
import org.bson.json.JsonMode;
import org.bson.json.JsonWriter;
import org.bson.json.JsonWriterSettings;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import br.mobi.util.VoObject;

public class MongoConnection <T extends VoObject>{

	private String collection = null;
	
	private MongoClient mongoClient = null;

	public MongoConnection(String collection) {
		// TODO Auto-generated constructor stub
		this.collection = collection;
	}
	
	private MongoCollection<Document> getCollection(){
		this.mongoClient = new MongoClient(new ServerAddress("localhost",27017));

		MongoDatabase db = mongoClient.getDatabase("mobiweb");

		MongoCollection<Document> coll = db.getCollection(this.collection);
		
		return coll;
	}
	
	private void closeConnection (){
		this.mongoClient.close();
	}

	public List<T> listarTodos (){
		List<T> lista = new ArrayList<T>();

		MongoCursor<Document> cursor = getCollection().find().iterator();
		try{
			while (cursor.hasNext()){
				System.out.println(cursor);
				Document docI = cursor.next();
				printJson(docI);
			}
		}finally {
			this.closeConnection();
		}
		return lista;
	}

	public List<T> listarFiltro(T filtro){
		List<T> lista = new ArrayList<T>();


		return lista;
	}
	
	public String inserir (T objeto){
		String inserir = "";
		
		try{
			MongoCollection<Document> collection = getCollection();
			collection.insertOne(objeto.toJason());
		}catch (Exception e) {
			inserir = e.getMessage();
		}finally {
			this.closeConnection();
		}
		
		return inserir;
	}
	
	public String alterar (T objeto){
		String alterar = "";
		
		return alterar;
	}
	
	public String deletar (T objeto){
		String deletar = "";
		
		return deletar;
	}
	
	
	private static void printJson(Document document) {

		JsonWriter jsonWriter = new JsonWriter(new StringWriter(), 
				new JsonWriterSettings(JsonMode.SHELL, false));

		new DocumentCodec().encode(jsonWriter, document, EncoderContext.builder().isEncodingCollectibleDocument(true).build());

		System.out.println(jsonWriter.getWriter());

		System.out.flush();
	}
}

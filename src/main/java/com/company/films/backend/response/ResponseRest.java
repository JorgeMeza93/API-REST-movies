package com.company.films.backend.response;

import java.util.ArrayList;
import java.util.HashMap;

public class ResponseRest {
	private ArrayList<HashMap<String, String>> metadata = new ArrayList<>();
	public ArrayList<HashMap<String, String>> getMetada(){
		return metadata;
	}
	public void setMetadata(String tipo, String codigo, String date){
		HashMap<String, String> mapa = new HashMap<String, String>();
		mapa.put("tipo", tipo);
		mapa.put("código", codigo);
		mapa.put("dato", date);
		metadata.add(mapa);
	}
	
	public String mensajePrueba(String mensaje){
		return mensaje;
	}
}

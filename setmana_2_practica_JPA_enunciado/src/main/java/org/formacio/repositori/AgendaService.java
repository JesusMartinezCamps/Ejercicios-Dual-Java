package org.formacio.repositori;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaService {

	//private Map<String, Persona> bbdd = new LinkedHashMap<>();
	
	@Autowired
	private PersonaRepository dataBase;
	
	
	@PostConstruct
	public void init() {
		dataBase.save(new Persona("ant","Antoni","971-555123"));
		dataBase.save(new Persona("joa","Joana","971-555555"));
		dataBase.save(new Persona("lin","Lina","971-555888"));
	}
	
	public void inserta (String id, String nom, String telefon) {
		dataBase.save(new Persona(id, nom, telefon));
	}
	
	public Persona recupera (String id) {
		return dataBase.findOne(id);
	}
	
	public long nombreContactes() {
		return dataBase.count();
	}
}

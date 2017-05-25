package org.formacio.repositori;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaService {

	//private Map<String, Persona> bbdd = new LinkedHashMap<>();
	
	@Autowired
	private PersonaRepository dataBase;
	
	@Autowired
	private GrupoService grupoService;
	
	
	//@PostConstruct
	public void init() {
		
		grupoService.create("uno");
		
		dataBase.save(new Persona("ant","Antoni","971-555123", grupoService.getGrupo("uno")));
		dataBase.save(new Persona("joa","Joana","971-555555", grupoService.getGrupo("uno")));
		dataBase.save(new Persona("lin","Lina","971-555888", grupoService.getGrupo("uno")));
	}
	
	public void inserta(String id, String nom, String telefon, String grupo) {
		if(!grupoService.existe(grupo)){
			grupoService.create(grupo);
		}
		dataBase.save(new Persona(id, nom, telefon, grupoService.getGrupo(grupo)));
	}
	
	public Persona recupera (String id) {
		return dataBase.findOne(id);
	}
	
	public long nombreContactes() {
		return dataBase.count();
	}
	
	public void deleteAll(){
		dataBase.deleteAll();
	}
	
	public String listadoGrupos(){
		ArrayList<String> listaGrupos = new ArrayList<String>();
		for(Grupo grupo: grupoService.getGrupos()){
			listaGrupos.add(grupo.getNombre());
		}
		return String.join(" ", listaGrupos);
	}
	
	public String listadoPersonasGrupo(String grupo){
		ArrayList<String> listaPersonas = new ArrayList<String>();
		
		for(Persona persona :  dataBase.findByGrupoNombre(grupo)){
			listaPersonas.add(persona.getNom());
		}		
		return String.join(" ", listaPersonas);
	}
	
	public void update(String id, String nom, String telefon, String grupo){

		Persona persona = dataBase.findByClau(id);
		
		if(persona == null){
			this.inserta(id, nom, telefon, grupo);
		}
		else {
			persona.setClau(id);
			persona.setNom(nom);
			persona.setTelefon(telefon);

			if(!grupoService.existe(grupo)){
				grupoService.create(grupo);
				persona.setGrupo(grupoService.getGrupo(grupo));
			}			
			dataBase.save(persona);
		}		
	}
	
	public String listadoPersonas(){
		List<String> listaPersonas = new ArrayList<String>();
		for(Persona persona : dataBase.findAll()){
			listaPersonas.add(persona.getNom());
		}
		return String.join(" ", listaPersonas);
	}
	

}

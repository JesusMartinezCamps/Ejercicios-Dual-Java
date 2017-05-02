package org.formacio.component;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ServeiAlumnat {

	@Autowired
	private RepositoriAlumnes repositori;


	@PostConstruct
	public void creacioAlumnes(){
		repositori.altaAlumne(1, "Antonia");
		repositori.altaAlumne(2, "Joan");
	}
	
	
	
	/**
	 * ha de donar d'alta a la base de dades d'alumnes l'alumne indicat amb 
	 * el corresponent codi.
	 * Si el nom de l'alumne es null, no l'ha de donar d'alta
	 * Retorna true si l'alumne s'ha inserit, false si no.
	 */
	public boolean matricula (int id, String alumne) {
		if(alumne == null){
			return false;
		}else{
			repositori.altaAlumne(id, alumne);
			return true;	
		}
		
	}
	
}

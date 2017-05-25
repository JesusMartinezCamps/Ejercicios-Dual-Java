package org.formacio.repositori;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrupoService {
	
	@Autowired
	private GrupoRepository grupo;
	
	public void deleteAll(){
		grupo.deleteAll();
	}
	
	public void create(String nombre){
		grupo.save(new Grupo(nombre));
	}

	public Grupo getGrupo(String nombre) {
		return grupo.findByNombre(nombre);
	}

	public Iterable<Grupo> getGrupos(){
		return grupo.findAll();
	}
		
	
	public boolean existe(String nombre){
		if(grupo.findByNombre(nombre) == null){
			return false;
		}
		else
			return true;
	}
	
	
}

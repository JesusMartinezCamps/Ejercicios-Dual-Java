package org.formacio.repositori;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
												    //Tipo de dato	//Tipo de la clave primaria
public interface PersonaRepository extends CrudRepository<Persona, String> {
	public Persona findByClau(String clau);
	public List<Persona> findByGrupoNombre(String nombre);
}

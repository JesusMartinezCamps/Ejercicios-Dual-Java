package org.formacio.repositori;

import org.springframework.data.repository.CrudRepository;
												    //Tipo de dato	//Tipo de la clave primaria
public interface PersonaRepository extends CrudRepository<Persona, String> {

}

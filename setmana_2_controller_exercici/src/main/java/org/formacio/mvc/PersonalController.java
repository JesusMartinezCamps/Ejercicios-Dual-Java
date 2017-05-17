package org.formacio.mvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/personal")
public class PersonalController {

	// no toqueu la declaracio de baseDeDades ni el metode getBaseDeDades
	// 
	// als metodes que anau afegint, tracteu aquest array com si fos la base de dades
	//
	// per exemple, obtenir la persona amb id 1 sera fer baseDeDades.get(1), etc etc 
	
	private List<String> baseDeDades = new ArrayList<>(Arrays.asList("Joana","Antonia","Pere"));
	
	public List<String> getBaseDeDades() {
		return baseDeDades;
	}

	// Poseu a partir d'aqui els vostre metodes
	
	@RequestMapping(path="/info")
	@ResponseBody
	public String info() {
		return "Hi ha " + getBaseDeDades().size() + " persones";
	}
	
	@RequestMapping(path="/consulta")
	@ResponseBody
	public String consulta(@RequestParam(name="id", required=false, defaultValue="0")int id) {
		String persona = getBaseDeDades().get(id);
		return persona;
	}
	
	
	@RequestMapping(path="/persona/{id}")
	@ResponseBody
	public String pathVariable(@PathVariable int id){
		String persona = getBaseDeDades().get(id);
		
		
		return persona;
	}
	
	
	@RequestMapping(path="/afegir")
	@ResponseBody
	public String afegir(int id, String name) {
		String persona = getBaseDeDades().set(id, name);
		return persona;
	}
}

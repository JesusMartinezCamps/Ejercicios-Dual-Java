package org.formacio.mvc;


import org.formacio.repositori.AgendaService;
import org.formacio.repositori.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AgendaServiceController {
	
	@Autowired
	private AgendaService agenda;
	
	@RequestMapping(path="/nombre")
	@ResponseBody
	public String nombreContactes(){
		Long nombreContactes = agenda.nombreContactes();
		return nombreContactes.toString();		
	}
	
	@RequestMapping(path="/telefon")
	@ResponseBody
	public String recuperaTelefon(@RequestParam String id){
		return agenda.recupera(id).getTelefon();
	}
	
	
	@RequestMapping(path="/contacte/{id}")
	@ResponseBody
	public Persona recuperaContacte(@PathVariable String id){
		if(agenda.recupera(id) == null){
			throw new OperationException();
		} 	
		else
			return agenda.recupera(id);
	}
	
	@RequestMapping(path="/afegir", method=RequestMethod.POST)
	@ResponseBody
	public String afegirContacte(@RequestParam String id, @RequestParam String nom, @RequestParam String telefon){
		agenda.inserta(id, nom, telefon);
		return "ok";
	}
	
	@RequestMapping(path="/actualizar", method=RequestMethod.POST)
	@ResponseBody
	public void actualizarPersona(@RequestParam String id, @RequestParam String nom, @RequestParam String telefon){
		/*if(agenda.recupera(id) != null){
			Persona provisional = agenda.recupera(id);
			provisional.setNom(nom);
			provisional.setTelefon(telefon);
			
			agenda.insertaPersonaObjeto(provisional);
		}else{
			agenda.inserta(id, nom, telefon);
		}*/
		agenda.inserta(id, nom, telefon);
	}

	@RequestMapping(path="/name")
	@ResponseBody
	public String cambiarNombre(@RequestParam String id){
		String nombreDeLaPersona = agenda.recupera(id).getNom();
		return nombreDeLaPersona;
	}
}

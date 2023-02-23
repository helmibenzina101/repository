package tn.store.delivery.controller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.store.delivery.*;
import tn.store.delivery.model.Commande;
import tn.store.delivery.service.*;
@RestController
@CrossOrigin(origins = "*")

public class CommandeController {

	//Attire the ArticlesService class  
	@Autowired  
	CommandeService cs;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/Commande")
	
	private List<Commande> getAllCommandes()   
	{  
		return cs.getAllCommandes();
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/Commande/{id}")  
	private Commande getCommandes(@PathVariable("id") int id)   
	{  
		return cs.getCommandesById(id)  ;
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/Commande/{Commandeid}")  
	private void deleteCommande(@PathVariable("Commandeid") int Commandeid)   
	{  
		cs.delete(Commandeid);  
	} 

	@PostMapping("/Commande")  
	private int saveCommande(@RequestBody Commande c)   
	{  
		cs.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/Commande")  
	private Commande update(@RequestBody  Commande c)   
	{  
		cs.saveOrUpdate(c);  
		return c;  
	}  
}
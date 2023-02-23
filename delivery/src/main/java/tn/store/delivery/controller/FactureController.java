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
import tn.store.delivery.model.Facture;
import tn.store.delivery.service.*;
@RestController
@CrossOrigin(origins = "*")

public class FactureController {

	//Attire the ArticlesService class  
	@Autowired  
	FactureService cs;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/Facture")
	
	private List<Facture> getAllFactures()   
	{  
		return cs.getAllFactures();
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/Facture/{id}")  
	private Facture getFactures(@PathVariable("id") int id)   
	{  
		return cs.getFacturesById(id)  ;
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/Facture/{Factureid}")  
	private void deleteFacture(@PathVariable("Factureid") int Factureid)   
	{  
		cs.delete(Factureid);  
	} 

	@PostMapping("/Facture")  
	private int saveFacture(@RequestBody Facture c)   
	{  
		cs.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/Facture")  
	private Facture update(@RequestBody  Facture c)   
	{  
		cs.saveOrUpdate(c);  
		return c;  
	}  
}
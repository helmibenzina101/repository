package tn.store.delivery.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.store.delivery.model.*;
import tn.store.delivery.repository.*;


@Service
public class CommandeService {

	@Autowired  
	CommandeRepository commandeRepository;  
	//getting all articles record by using the method findaAll() of CrudRepository  

	//getting all articles record by using the method findaAll() of CrudRepository  
	public List<Commande> getAllCommandes()   
	{
		List<Commande> commandes = new ArrayList<Commande>();  
	  commandeRepository.findAll().forEach(a -> commandes.add(a));  
		return commandes;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Commande getCommandesById(int id)   
	{  
		return commandeRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(tn.store.delivery.model.Commande c)   
	{  
		commandeRepository.save(c);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		commandeRepository.deleteById(id);  
	} 
  
}
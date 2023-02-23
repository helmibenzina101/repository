package tn.store.delivery.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.store.delivery.model.*;
import tn.store.delivery.repository.*;


@Service
public class FactureService {

	@Autowired  
	FactureRepository factureRepository;  
	//getting all articles record by using the method findaAll() of CrudRepository  

	//getting all articles record by using the method findaAll() of CrudRepository  
	public List<Facture> getAllFactures()   
	{
		List<Facture> factures = new ArrayList<Facture>();  
	  factureRepository.findAll().forEach(a -> factures.add(a));  
		return factures;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Facture getFacturesById(int id)   
	{  
		return factureRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(tn.store.delivery.model.Facture c)   
	{  
		factureRepository.save(c);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		factureRepository.deleteById(id);  
	} 
  
}
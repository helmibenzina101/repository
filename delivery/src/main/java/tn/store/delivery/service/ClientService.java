package tn.store.delivery.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.store.delivery.model.*;
import tn.store.delivery.repository.*;


@Service
public class ClientService {

	@Autowired  
	ClientRepository clientRepository;  
	//getting all articles record by using the method findaAll() of CrudRepository  

	//getting all articles record by using the method findaAll() of CrudRepository  
	public List<Client> getAllClients()   
	{
		List<Client> clients = new ArrayList<Client>();  
	  clientRepository.findAll().forEach(a -> clients.add(a));  
		return clients;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Client getClientsById(int id)   
	{  
		return clientRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(tn.store.delivery.model.Client c)   
	{  
		clientRepository.save(c);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		clientRepository.deleteById(id);  
	} 
  
}
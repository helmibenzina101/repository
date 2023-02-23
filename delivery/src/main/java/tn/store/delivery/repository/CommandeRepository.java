package tn.store.delivery.repository;

import org.springframework.data.repository.CrudRepository;

import tn.store.delivery.model.*;


public interface CommandeRepository extends CrudRepository<Commande, Integer> 
{  
	
}
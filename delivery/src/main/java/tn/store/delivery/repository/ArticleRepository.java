package tn.store.delivery.repository;

import org.springframework.data.repository.CrudRepository;

import tn.store.delivery.model.*;


public interface ArticleRepository extends CrudRepository<Article, Integer> 
{  
	
}
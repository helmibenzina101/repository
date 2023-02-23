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
import tn.store.delivery.model.Article;
import tn.store.delivery.service.*;
@RestController
@CrossOrigin(origins = "*")

public class ArticleController {

	//Attire the ArticlesService class  
	@Autowired  
	ArticleService cs;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/Article")
	
	private List<Article> getAllArticles()   
	{  
		return cs.getAllArticles();
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/Article/{id}")  
	private Article getArticles(@PathVariable("id") int id)   
	{  
		return cs.getArticlesById(id)  ;
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/Article/{Articleid}")  
	private void deleteArticle(@PathVariable("Articleid") int Articleid)   
	{  
		cs.delete(Articleid);  
	} 

	@PostMapping("/Article")  
	private int saveArticle(@RequestBody Article c)   
	{  
		cs.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/Article")  
	private Article update(@RequestBody  Article c)   
	{  
		cs.saveOrUpdate(c);  
		return c;  
	}  
}
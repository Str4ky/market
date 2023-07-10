package fr.market.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.market.dao.IProduitRepository;
import fr.market.entities.Produit;

@RestController@CrossOrigin

public class ProduitRest {
	@Autowired
	private IProduitRepository produitRepo;
	@GetMapping("produit")
	public Iterable <Produit>getAllProduit(){
		return produitRepo.findAll();
	}
	@PostMapping("produit")
	public Produit saveProduit (@RequestBody Produit produit) {
	    return produitRepo.save(produit);
	}
	@GetMapping("produit/{id}")
    public Optional<Produit>getOneProduit(@PathVariable Long id){
    	return produitRepo.findById(id);
    }
	
}

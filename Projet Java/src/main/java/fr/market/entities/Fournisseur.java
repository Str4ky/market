package fr.market.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



 @AllArgsConstructor
 @NoArgsConstructor
 @Data
 @Entity
 @Table(name="Fournisseur")
public class Fournisseur {
	@Id
	@GeneratedValue
	
	    private Long id_fournisseur;
		
	    private String nom;
	    
	    private String ville;


}

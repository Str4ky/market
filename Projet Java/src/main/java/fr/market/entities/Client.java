package fr.market.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Client {
	
	@Id
	@GeneratedValue

    private Long id;
	
    private String nom;

    private String prenom;
    
	@Column(unique = true)
	private String email;
	
	private String password;

    private String ville;


   
}


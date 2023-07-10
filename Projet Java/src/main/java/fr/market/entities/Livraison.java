package fr.market.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Livraison {
	
    private Float prix_achat;	

    private int quantite;

}

package fr.market.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.market.entities.Produit;

public interface IProduitRepository extends JpaRepository<Produit, Long> {

}

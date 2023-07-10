package fr.market.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.market.entities.Commande;

public interface ICommandeRepository extends JpaRepository<Commande,Long> {

}

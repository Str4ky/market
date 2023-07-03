package fr.market.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.market.entities.Client;
import fr.market.utils.MarketConstantes.MarketConstantesDAO;

@Repository(MarketConstantesDAO.CLIENT_DAO)
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
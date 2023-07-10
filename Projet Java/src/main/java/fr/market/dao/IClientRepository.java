package fr.market.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.market.entities.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {
    public Optional<Client> findByEmailAndPassword(String email, String password);
}
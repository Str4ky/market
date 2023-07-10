package fr.market.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.market.dao.IClientRepository;
import fr.market.entities.Client;

@RestController
@CrossOrigin("*")
public class ClientRest {
	@Autowired
	private IClientRepository clientRepo;
	
	@GetMapping("client")
	
	public Iterable<Client> getAllClient(){
		return clientRepo.findAll();
	}
	@PostMapping("client")
	public Client saveClient (@RequestBody Client client) {
	    return clientRepo.save(client);
	}
	@GetMapping("client/{id}")
    public Optional<Client>getOneClient(@PathVariable Long id){
    	return clientRepo.findById(id);
    }
    
	@PostMapping("login")
    public Optional<Client> connexion(@RequestBody Client client) {
    	return clientRepo.findByEmailAndPassword(client.getEmail(), client.getPassword());
    }
}

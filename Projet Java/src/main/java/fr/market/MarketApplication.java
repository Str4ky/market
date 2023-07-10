package fr.market;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.market.dao.IClientRepository;
import fr.market.dao.IProduitRepository;
import fr.market.entities.Client;
import fr.market.entities.Produit;

@SpringBootApplication
public class MarketApplication implements CommandLineRunner {
	@Autowired
	private IClientRepository client;
	
	@Autowired
	private IProduitRepository produit;
	
	public static void main(String[] args) {
		SpringApplication.run(MarketApplication.class, args);
		
		System.out.println("Running");
	}


	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Loading");
		
		Client client1 = new Client(null,"REQUISTON","Timothé", "tim-req.pro@outlook.fr", "password", "Lyon");
		
		client.save(client1);
		
		Produit produit1 = new Produit(null,"Ordinateur", 800, "https://cdn.conforama.fr/prod/product/image/6e93/G_CNF_Y29917276_B.jpeg");
		Produit produit2 = new Produit(null,"Téléphone", 400, "https://www.centronoli.it/wp-content/uploads/2022/12/511008.jpg");
		Produit produit3 = new Produit(null,"Casque VR", 600, "https://prestacomaudiovisuel.com/1155-large_default/casque-vr-oculus-rift.jpg");
		
		produit.save(produit1);
		produit.save(produit2);
		produit.save(produit3);
		
	 }
	public String getClient(Client client1) {
		return "Le client n"+client1.getId()+" se nomme " +client1.getNom() +" "+ client1.getPrenom()+" et habite à "+client1.getVille();    
				
	}                               
	
}
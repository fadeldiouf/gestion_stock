package simplon.sn.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import simplon.sn.stock.dao.CategorieRepository;
import simplon.sn.stock.dao.GerantRepository;
import simplon.sn.stock.dao.MagasinRepository;
import simplon.sn.stock.dao.ProduitRepository;
import simplon.sn.stock.entites.Categorie;
import simplon.sn.stock.entites.Gerant;
import simplon.sn.stock.entites.Magasin;
import simplon.sn.stock.entites.Produit;

@SpringBootApplication
public class GestionStockApplication implements CommandLineRunner {
	@Autowired 
	ProduitRepository produitRepository;
	@Autowired
	CategorieRepository categorieRepository;
	@Autowired
	MagasinRepository magasinRepository;
	@Autowired
	GerantRepository gerantRepository;
	@Autowired
	RepositoryRestConfiguration configuration;

	public static void main(String[] args) {
		SpringApplication.run(GestionStockApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		configuration.exposeIdsFor(Gerant.class);
		configuration.exposeIdsFor(Magasin.class);
//		configuration.exposeIdsFor(Produit.class);
//		configuration.exposeIdsFor(Categorie.class);
//		Categorie categorie=(new Categorie("sim", "sim"));
		Gerant gerant= (new Gerant("fadel", "ndeya", null, null, null, null, null, null));
		gerantRepository.save(gerant);
		Magasin magasin= (new Magasin("touba", null, null, null, null, gerant));
		magasinRepository.save(magasin);
//		
//		categorieRepository.save(categorie);
//		produitRepository.save(new Produit("prod", "prod", null, null, null, categorie, null));
		
		// TODO Auto-generated method stub
		
	}

}

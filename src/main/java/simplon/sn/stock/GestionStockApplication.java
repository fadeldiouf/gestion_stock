package simplon.sn.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
=======
>>>>>>> db7c4ed
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import simplon.sn.stock.dao.ProduitRepository;
import simplon.sn.stock.entites.Produit;

@SpringBootApplication
public class GestionStockApplication implements CommandLineRunner{
	@Autowired
	ProduitRepository produitRepository;
	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;
<<<<<<< HEAD
>>>>>>> 7caaa03137d871f8e72d775474b26e72ead7731d
=======
>>>>>>> db7c4ed

	public static void main(String[] args) {
		SpringApplication.run(GestionStockApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		configuration.exposeIdsFor(Gerant.class);
		configuration.exposeIdsFor(Magasin.class);
//		configuration.exposeIdsFor(Produit.class);
//		configuration.exposeIdsFor(Categorie.class);
////		Categorie categorie=(new Categorie("sim", "sim"));
//		Gerant gerant= (new Gerant("fadel", "ndeya", null, null, null, null, null, null));
//		gerantRepository.save(gerant);
//		Magasin magasin= (new Magasin("touba", null, null, null, null, gerant));
//		magasinRepository.save(magasin);
//		
//		categorieRepository.save(categorie);
//		produitRepository.save(new Produit("prod", "prod", null, null, null, categorie, null));
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repositoryRestConfiguration.exposeIdsFor(Produit.class);
		Produit p = new Produit("sass", "venant", 15000d, null, "marteau.jpg", null, null);
//		produitRepository.save(p);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repositoryRestConfiguration.exposeIdsFor(Produit.class);
		Produit p = new Produit("sass", "venant", 15000d, null, "marteau.jpg", null, null);
//		produitRepository.save(p);
		
	}

}

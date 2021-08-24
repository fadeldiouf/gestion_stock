package simplon.sn.stock.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simplon.sn.stock.entites.Produit;
import simplon.sn.stock.service.ProduitService;

@RestController
@RequestMapping("/produits")
public class ProduitController {
	@Autowired
	private ProduitService produitService;
	
	@GetMapping("/all")
	public List<Produit> getAllproduit(){
		return produitService.findAllProduit();
	}
	@PostMapping("/save")
	public Produit saveproduit(@RequestBody Produit p) {
		return produitService.create(p);
		
	}
	
	@PutMapping("/update")
	public Boolean update (@RequestBody Produit p) {
		return produitService.update(p);
		
	}
	@GetMapping("/{id}")
	public Optional<Produit> findById(@PathVariable ("id") Long id){
		return produitService.findById(id);
	}
	

}

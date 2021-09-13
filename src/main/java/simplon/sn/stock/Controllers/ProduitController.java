package simplon.sn.stock.Controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

<<<<<<< HEAD
=======
import javax.servlet.ServletContext;

>>>>>>> 7caaa03137d871f8e72d775474b26e72ead7731d
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;



import org.springframework.validation.annotation.Validated;

import simplon.sn.stock.dao.ProduitRepository;
import simplon.sn.stock.entites.Produit;
import simplon.sn.stock.service.ProduitService;
@CrossOrigin("*")
@RestController
@RequestMapping("/produits")
public class ProduitController {
	@Autowired
	private ProduitService produitService;
<<<<<<< HEAD
	@Autowired 
	private ProduitRepository prRepository;
=======
	@Autowired
	ProduitRepository prRepository;
>>>>>>> 7caaa03137d871f8e72d775474b26e72ead7731d
	private final Path root = Paths.get(System.getProperty("user.home")+"/stock/images/");
	@Autowired
	ServletContext context;
	
	
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
	@GetMapping("/photo/{id}")
	public byte[] getIamges (@PathVariable ("id") Long id) throws IOException {
		Produit produit= prRepository.findById(id).get();
		
			return Files.readAllBytes(Paths.get(context.getRealPath("/images/")+produit.getPhoto()));
		}
		
<<<<<<< HEAD
	}
	@PostMapping("/saveproduit")
	public Produit createProduit(@Validated @RequestParam MultipartFile file, @RequestParam String produit)
=======
		
	@PostMapping("/saveProduit")
	public Produit createProduit(@Validated @RequestParam MultipartFile file, @PathVariable("produit") String produit)
>>>>>>> 7caaa03137d871f8e72d775474b26e72ead7731d
			throws JsonParseException, org.codehaus.jackson.map.JsonMappingException, IOException { 
		Produit produit1= new ObjectMapper().readValue(produit, Produit.class);
		SimpleDateFormat forme = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
		String filename= file.getOriginalFilename().concat(forme.format(new Date()));
		produit1.setPhoto(filename);
		
		try {
			Files.copy(file.getInputStream(), this.root.resolve(filename));
			return prRepository.save(produit1);
		} catch (Exception e) {
			throw new RuntimeException("Imposible de Stocker le fichier"+ e.getMessage());
		}
		
		
	}
	

}

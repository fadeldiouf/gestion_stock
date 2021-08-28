package simplon.sn.stock.Controllers;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import simplon.sn.stock.dao.ProduitRepository;
import simplon.sn.stock.entites.Produit;
@RestController
public class PhotoController {
	@Autowired private ProduitRepository prRepository;
	@GetMapping(path="/photo/{id}",produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] getphoto (@PathVariable("id") Long id) throws Exception {
		Produit p= prRepository.getById(id);
		String photo=p.getPhoto();
		
		 return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/stock/images/"+photo));
		
	}

}

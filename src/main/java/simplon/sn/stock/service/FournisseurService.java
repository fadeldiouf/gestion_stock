package simplon.sn.stock.service;

import java.util.List;
import java.util.Optional;

import simplon.sn.stock.entites.Fournisseur;

public interface FournisseurService  {

	public List<Fournisseur> getAllFournisseur();
	
	public Fournisseur create(Fournisseur f);
	
	public Boolean update (Fournisseur f);
	
	public Optional<Fournisseur> findById(Long id);
}

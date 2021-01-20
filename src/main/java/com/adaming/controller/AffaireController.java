package com.adaming.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Affaire;
import com.adaming.entities.Tache;
import com.adaming.entities.Tribunal;
import com.adaming.services.IAffaireService;
import com.adaming.services.ITacheService;
import com.adaming.services.ITribunalService;

@CrossOrigin("*")
@RestController
public class AffaireController {
	@Autowired
	IAffaireService affaireService;
	@Autowired
	ITribunalService tribunalService;
	@Autowired
	ITacheService tacheService;

	@RequestMapping(value = "affaires", method = RequestMethod.GET)
	public List<Affaire> findAll() {
		return affaireService.findAll();
	}

	@RequestMapping(value = "affaires/{id}", method = RequestMethod.GET)
	public Affaire findOne(@PathVariable("id") Long id) {
		return affaireService.findOne(id);
	}

	@RequestMapping(value = "affaires/{idTribunal}", method = RequestMethod.POST)
	public Affaire saveAffaire(@PathVariable("idTribunal") Long idTribunal, @RequestBody Affaire affaire) {
		Tache tache = new Tache();
		Tribunal tribunal = tribunalService.findOne(idTribunal);
		tache.setAffaire(affaire);
		tache.setTribunal(tribunal);
		tache.setTitre("aaa");
		affaire.addTache(tache);
		return affaireService.save(affaire);
	}

	@RequestMapping(value = "affaires/{id}", method = RequestMethod.DELETE)
	public void deleteAffaire(@PathVariable("id") Long id) {
		affaireService.delete(id);
	}

	@RequestMapping(value = "affaires/{id}", method = RequestMethod.PUT)
	public Affaire updateAffaire(@PathVariable("id") Long id, @RequestBody Affaire affaire) {
		Affaire currentAffaire = affaireService.findOne(id);
		currentAffaire.setReference(affaire.getReference());
		currentAffaire.setTitre(affaire.getTitre());
		currentAffaire.setDescription(affaire.getDescription());
		currentAffaire.setStatut(affaire.isStatut());
		return affaireService.save(currentAffaire);
	}
}

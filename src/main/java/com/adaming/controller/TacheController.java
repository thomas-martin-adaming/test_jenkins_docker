package com.adaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.entities.Tache;
import com.adaming.services.TacheService;

public class TacheController {
	@Autowired
	TacheService tacheService;

	@RequestMapping(value = "taches", method = RequestMethod.POST)
	public Tache saveTribunal(@RequestBody Tache tache) {
		return tacheService.save(tache);
	}

	@RequestMapping(value = "taches/{id}", method = RequestMethod.PUT)
	public Tache updateTache(@PathVariable("id") Long id, @RequestBody Tache tache) {
		Tache currentTache = tacheService.findOne(id);
		currentTache.setTitre(tache.getTitre());
		currentTache.setAffaire(tache.getAffaire());
		currentTache.setTribunal(tache.getTribunal());
		return tacheService.save(currentTache);
	}
}

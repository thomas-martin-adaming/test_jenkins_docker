package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Tribunal;
import com.adaming.services.ITribunalService;

@CrossOrigin("*")
@RestController
public class TribunalController {
	@Autowired
	ITribunalService tribunalService;

	@RequestMapping(value = "tribunals", method = RequestMethod.GET)
	public List<Tribunal> findAll() {
		return tribunalService.findAll();
	}

	@RequestMapping(value = "tribunals/{id}", method = RequestMethod.GET)
	public Tribunal findOne(@PathVariable("id") Long id) {
		return tribunalService.findOne(id);
	}

	@RequestMapping(value = "tribunals", method = RequestMethod.POST)
	public Tribunal saveTribunal(@RequestBody Tribunal tribunal) {
		return tribunalService.save(tribunal);
	}

	@RequestMapping(value = "tribunals/{id}", method = RequestMethod.DELETE)
	public void deleteTribunal(@PathVariable("id") Long id) {
		tribunalService.delete(id);
	}

	@RequestMapping(value = "tribunals/{id}", method = RequestMethod.PUT)
	public Tribunal updateTribunal(@PathVariable("id") Long id, @RequestBody Tribunal tribunal) {
		Tribunal currentTribunal = tribunalService.findOne(id);
		return tribunalService.save(currentTribunal);
	}
}

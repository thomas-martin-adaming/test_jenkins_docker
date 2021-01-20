package com.adaming.services;

import java.util.List;


import com.adaming.entities.Affaire;

public interface IAffaireService {
	public List<Affaire> findAll();

	public Affaire findOne(Long id);

	public Affaire save(Affaire affaire);

	public void delete(Long id);
	
}

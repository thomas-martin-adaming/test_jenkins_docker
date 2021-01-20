package com.adaming.services;

import com.adaming.entities.Tache;

public interface ITacheService {
	public Tache save(Tache tache);
	public Tache findOne(Long id);
}

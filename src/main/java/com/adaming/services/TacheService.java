package com.adaming.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Tache;
import com.adaming.repositories.TacheRepository;
@Service
public class TacheService implements ITacheService {
	@Autowired
	private TacheRepository tacheRepository;

	@Override
	public Tache save(Tache tache) {
		return tacheRepository.save(tache);
	}

	@Override
	public Tache findOne(Long id) {
		return tacheRepository.getOne(id);
	}

}

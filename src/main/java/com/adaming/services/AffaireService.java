package com.adaming.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Affaire;
import com.adaming.repositories.AffaireRepository;
import com.adaming.repositories.TribunalRepository;

@Service
public class AffaireService implements IAffaireService {
	@Autowired
	AffaireRepository affaireRepository;
	@Autowired
	TribunalRepository tribunalRepository;

	@Override
	public List<Affaire> findAll() {
		return affaireRepository.findAll();
	}

	@Override
	public Affaire findOne(Long id) {
		return affaireRepository.getOne(id);
	}

	@Override
	public Affaire save(Affaire affaire) {
		return affaireRepository.save(affaire);
	}

	@Override
	public void delete(Long id) {
		affaireRepository.deleteById(id);
	}

}

package com.adaming.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Tribunal;
import com.adaming.repositories.TribunalRepository;

@Service
public class TribunalService implements ITribunalService {
	@Autowired
	TribunalRepository tribunalRepository;

	@Override
	public List<Tribunal> findAll() {
		return tribunalRepository.findAll();
	}

	@Override
	public Tribunal findOne(Long id) {
		return tribunalRepository.getOne(id);
	}

	@Override
	public Tribunal save(Tribunal tribunal) {
		return tribunalRepository.save(tribunal);
	}

	@Override
	public void delete(Long id) {
		tribunalRepository.deleteById(id);
	}

}

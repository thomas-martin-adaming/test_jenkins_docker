package com.adaming.services;

import java.util.List;

import com.adaming.entities.Tribunal;

public interface ITribunalService {
	public List<Tribunal> findAll();

	public Tribunal findOne(Long id);

	public Tribunal save(Tribunal tribunal);

	public void delete(Long id);
}

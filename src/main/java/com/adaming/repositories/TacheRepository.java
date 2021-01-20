package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Tache;

@Repository
public interface TacheRepository extends JpaRepository<Tache,Long>{

}

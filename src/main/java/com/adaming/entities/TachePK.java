package com.adaming.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class TachePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Affaire affaire;
	private Tribunal tribunal;

	public TachePK() {
	}
	@ManyToOne(cascade = CascadeType.ALL)
	public Affaire getAffaire() {
		return affaire;
	}

	public void setAffaire(Affaire affaire) {
		this.affaire = affaire;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	public Tribunal getTribunal() {
		return tribunal;
	}

	public void setTribunal(Tribunal tribunal) {
		this.tribunal = tribunal;
	}

}

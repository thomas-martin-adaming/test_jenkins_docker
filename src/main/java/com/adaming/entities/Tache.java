package com.adaming.entities;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.persistence.JoinColumn;

@Entity
@AssociationOverrides({
		@AssociationOverride(name = "primaryKey.affaire", joinColumns = @JoinColumn(name = "AFFAIRE_ID")),
		@AssociationOverride(name = "primaryKey.tribunal", joinColumns = @JoinColumn(name = "TRIBUNAL_ID")) })
public class Tache {
	private TachePK primaryKey = new TachePK();
	private String titre;

	public Tache() {
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@EmbeddedId
	public TachePK getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(TachePK primaryKey) {
		this.primaryKey = primaryKey;
	}

	@Transient
	public Affaire getAffaire() {
		return getPrimaryKey().getAffaire();
	}

	public void setAffaire(Affaire affaire) {
		getPrimaryKey().setAffaire(affaire);
	}

	@Transient
	public Tribunal getTribunal() {
		return getPrimaryKey().getTribunal();
	}

	public void setTribunal(Tribunal tribunal) {
		getPrimaryKey().setTribunal(tribunal);
	}

}

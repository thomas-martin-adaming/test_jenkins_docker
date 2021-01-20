package com.adaming.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tribunal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRIBUNAL_ID")
	private Long idTribunal;
	private String adresse;
	private Long fax;
	private Long tel;
	private String region;
	@OneToMany(mappedBy = "primaryKey.tribunal", cascade = CascadeType.ALL)
	private Set<Tache> taches = new HashSet<Tache>();

	public Tribunal() {
	}

	public Long getIdTribunal() {
		return idTribunal;
	}

	public void setIdTribunal(Long idTribunal) {
		this.idTribunal = idTribunal;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Long getFax() {
		return fax;
	}

	public void setFax(Long fax) {
		this.fax = fax;
	}

	public Long getTel() {
		return tel;
	}

	public void setTel(Long tel) {
		this.tel = tel;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Set<Tache> getTaches() {
		return taches;
	}

	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}

	public void addTache(Tache tache) {
		this.taches.add(tache);
	}

}

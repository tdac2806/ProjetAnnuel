package com.Model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="parcours")
public class parcours implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, unique =true)
	private int id;
	
	@Column(name="nom", nullable = true, unique=false, length=50)
	private String nom;
	
	@Column(name="duree", nullable = true, unique=false, length=150)
	private int duree;
	
	@Column(name="place", nullable = true, unique=false)
	private int place;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="PersonnelId")
	private Set<personnel> personnels;

	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="CandidatId")
	private Set<candidat> candidats;


	public parcours() {
		super();
	}


	public parcours(String nom, int duree, int place) {
		super();
		this.nom = nom;
		this.duree = duree;
		this.place = place;
	}


	public int getid() {
		return id;
	}


	public void setid(int id) {
		this.id = id;
	}


	public String getnom() {
		return nom;
	}


	public void setnom(String nom) {
		this.nom = nom;
	}


	public int getduree() {
		return duree;
	}


	public void setduree(int duree) {
		this.duree = duree;
	}

	public int getplace() {
		return place;
	}


	public void setplace(int place) {
		this.place = place;
	}


	public Set<candidat> getCandidats() {
		return candidats;
	}


	public void setCandidats(Set<candidat> candidats) {
		this.candidats = candidats;
	}
	
}

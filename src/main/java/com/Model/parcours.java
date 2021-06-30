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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="parcours")
public class parcours implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="par_id", nullable = false, unique =true)
	private int par_id;
	
	@Column(name="par_nom", nullable = true, unique=false, length=50)
	private String par_nom;
	
	@Column(name="par_duree", nullable = true, unique=false, length=150)
	private int par_duree;
	
	@Column(name="par_certif", nullable = true, unique=false)
	private String par_certif;
	
	@Column(name="par_place", nullable = true, unique=false)
	private String par_place;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="par_id")
	private Set<intervenant> intervenants;

	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="par_id")
	private Set<candidat> candidats;


	public parcours() {
		super();
	}


	public parcours(String par_nom, int par_duree, String par_certif, String par_place) {
		super();
		this.par_nom = par_nom;
		this.par_duree = par_duree;
		this.par_certif = par_certif;
		this.par_place = par_place;
	}


	public int getPar_id() {
		return par_id;
	}


	public void setPar_id(int par_id) {
		this.par_id = par_id;
	}


	public String getPar_nom() {
		return par_nom;
	}


	public void setPar_nom(String par_nom) {
		this.par_nom = par_nom;
	}


	public int getPar_duree() {
		return par_duree;
	}


	public void setPar_duree(int par_duree) {
		this.par_duree = par_duree;
	}


	public String getPar_certif() {
		return par_certif;
	}


	public void setPar_certif(String par_certif) {
		this.par_certif = par_certif;
	}


	public String getPar_place() {
		return par_place;
	}


	public void setPar_place(String par_place) {
		this.par_place = par_place;
	}


	public Set<intervenant> getIntervenants() {
		return intervenants;
	}


	public void setIntervenants(Set<intervenant> intervenants) {
		this.intervenants = intervenants;
	}


	public Set<candidat> getCandidats() {
		return candidats;
	}


	public void setCandidats(Set<candidat> candidats) {
		this.candidats = candidats;
	}
	
}

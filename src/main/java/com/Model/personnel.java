package com.Model;

import java.io.Serializable;
import java.util.HashSet;
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
import javax.persistence.Table;

@Entity
@Table(name="personnel")
public class personnel implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, unique =true)
	private int id;
	
	@Column(name="nom", nullable = true, unique=false, length=50)
	private String nom;
	
	@Column(name="prenom", nullable = true, unique=false, length=150)
	private String prenom;
	
	@Column(name="role", nullable = true, unique=false)
	private String role;
	
	@Column(name="competence", nullable = true, unique=false)
	private String competence;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Set<parcours> parcours;

   @ManyToMany(mappedBy = "entretien")
   private Set<candidat> candidat = new HashSet<>();



	public personnel() {
		super();
	}

	public personnel(String nom, String prenom, String role, String competence) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.role = role;
		this.competence = competence;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCompetence() {
		return competence;
	}

	public void setCompetence(String competence) {
		this.competence = competence;
	}

	public Set<parcours> getParcours() {
		return parcours;
	}

	public void setParcours(Set<parcours> parcours) {
		this.parcours = parcours;
	}

	
}

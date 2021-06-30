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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="candidat")
public class candidat implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, unique =true)
	private int id;
	
	@Column(name="nom", nullable = true, unique=false, length=50)
	private String nom;
	
	@Column(name="prenom", nullable = true, unique=false, length=150)
	private String prenom;
	
	@Column(name="email", nullable = true, unique=false)
	private String email;
	
	@Column(name="tel", nullable = true, unique=false)
	private int tel;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ParcoursId")
	private Set<parcours> parcours;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Set<entretien> entretiens;

	public candidat() {
		super();
	}

	public candidat(String nom, String prenom, String email, int tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
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

	public String getprenom() {
		return prenom;
	}

	public void setprenom(String prenom) {
		this.prenom = prenom;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public int gettel() {
		return tel;
	}

	public void settel(int tel) {
		this.tel = tel;
	}

	public Set<parcours> getParcours() {
		return parcours;
	}

	public void setParcours(Set<parcours> parcours) {
		this.parcours = parcours;
	}

	public Set<entretien> getEntretiens() {
		return entretiens;
	}

	public void setEntretiens(Set<entretien> entretiens) {
		this.entretiens = entretiens;
	}
	
	
	
}

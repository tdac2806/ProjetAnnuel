package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="intervenant")
public class candidat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="can_id", nullable = false, unique =true)
	private int can_id;
	
	@Column(name="can_nom", nullable = true, unique=false, length=50)
	private String can_nom;
	
	@Column(name="can_prenom", nullable = true, unique=false, length=150)
	private int can_prenom;
	
	@Column(name="can_email", nullable = true, unique=false)
	private String can_email;
	
	@Column(name="can_tel", nullable = true, unique=false)
	private int can_tel;
	
	@ManyToOne
	private parcours parcours;
	
	@ManyToOne
	private entretien entretien;

	public candidat() {
		super();
	}

	public candidat(String can_nom, int can_prenom, String can_email, int can_tel) {
		super();
		this.can_nom = can_nom;
		this.can_prenom = can_prenom;
		this.can_email = can_email;
		this.can_tel = can_tel;
	}

	public int getCan_id() {
		return can_id;
	}

	public void setCan_id(int can_id) {
		this.can_id = can_id;
	}

	public String getCan_nom() {
		return can_nom;
	}

	public void setCan_nom(String can_nom) {
		this.can_nom = can_nom;
	}

	public int getCan_prenom() {
		return can_prenom;
	}

	public void setCan_prenom(int can_prenom) {
		this.can_prenom = can_prenom;
	}

	public String getCan_email() {
		return can_email;
	}

	public void setCan_email(String can_email) {
		this.can_email = can_email;
	}

	public int getCan_tel() {
		return can_tel;
	}

	public void setCan_tel(int can_tel) {
		this.can_tel = can_tel;
	}
	
}

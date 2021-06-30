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
@Table(name="intervenant")
public class intervenant implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="inter_id", nullable = false, unique =true)
	private int inter_id;
	
	@Column(name="inter_nom", nullable = true, unique=false, length=50)
	private String inter_nom;
	
	@Column(name="inter_prenom", nullable = true, unique=false, length=150)
	private int inter_prenom;
	
	@Column(name="inter_role", nullable = true, unique=false)
	private String inter_role;
	
	@Column(name="inter_comp", nullable = true, unique=false)
	private String inter_comp;
	
	
	@ManyToOne
	private parcours parcours;
	
	@ManyToOne
	private entretien entretien;

	public intervenant() {
		super();
	}

	public intervenant(String inter_nom, int inter_prenom, String inter_role, String inter_comp) {
		super();
		this.inter_nom = inter_nom;
		this.inter_prenom = inter_prenom;
		this.inter_role = inter_role;
		this.inter_comp = inter_comp;
	}

	public int getInter_id() {
		return inter_id;
	}

	public void setInter_id(int inter_id) {
		this.inter_id = inter_id;
	}

	public String getInter_nom() {
		return inter_nom;
	}

	public void setInter_nom(String inter_nom) {
		this.inter_nom = inter_nom;
	}

	public int getInter_prenom() {
		return inter_prenom;
	}

	public void setInter_prenom(int inter_prenom) {
		this.inter_prenom = inter_prenom;
	}

	public String getInter_role() {
		return inter_role;
	}

	public void setInter_role(String inter_role) {
		this.inter_role = inter_role;
	}

	public String getInter_comp() {
		return inter_comp;
	}

	public void setInter_comp(String inter_comp) {
		this.inter_comp = inter_comp;
	}

}

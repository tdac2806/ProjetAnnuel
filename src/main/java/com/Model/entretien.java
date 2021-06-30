package com.Model;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name="entretien")
public class entretien  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ent_id", nullable = false, unique =true)
	private int ent_id;
	
	@Column(name="ent_date", nullable = true, unique=false, length=50)
	private Date ent_date;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ent_id")
	private Set<intervenant> intervenants;

	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ent_id")
	private Set<candidat> candidats;


	public entretien() {
		super();
	}


	public entretien(Date ent_date) {
		super();
		this.ent_date = ent_date;
	}


	public int getEnt_id() {
		return ent_id;
	}


	public void setEnt_id(int ent_id) {
		this.ent_id = ent_id;
	}


	public Date getEnt_date() {
		return ent_date;
	}


	public void setEnt_date(Date ent_date) {
		this.ent_date = ent_date;
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

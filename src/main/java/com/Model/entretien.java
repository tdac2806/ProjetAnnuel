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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="entretien")
public class entretien  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, unique =true)
	private int id;
	
	@Column(name="date", nullable = true, unique=false, length=50)
	private Date date;
	
	@Column(name="StatutInscruption", nullable = true, unique=false)
	private int statut;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="PersonnelId")
	private personnel personnel;

	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CandidatId")
	private candidat candidat;


	public entretien() {
		super();
	}


	public entretien(Date date, int statut) {
		super();
		this.date = date;
		this.statut=statut;
	}


	public int getid() {
		return id;
	}


	public void setid(int id) {
		this.id = id;
	}


	public Date getdate() {
		return date;
	}


	public void setdate(Date date) {
		this.date = date;
	}


	public personnel getPersonnel() {
		return personnel;
	}


	public void setPersonnel(personnel personnel) {
		this.personnel = personnel;
	}


	public candidat getCandidat() {
		return candidat;
	}


	public void setCandidat(candidat candidat) {
		this.candidat = candidat;
	}


	public int getStatut() {
		return statut;
	}


	public void setStatut(int statut) {
		this.statut = statut;
	}
	

	
}

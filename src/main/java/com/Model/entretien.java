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
	private String date;
	
	@Column(name="StatutInscruption", nullable = true, unique=false)
	private String StatutInscruption;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="PersonnelId")
	private personnel personnel;

	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CandidatId")
	private candidat candidat;


	public entretien() {
		super();
	}


	

	public entretien(String date, String statutInscruption) {
		super();
		this.date = date;
		StatutInscruption = statutInscruption;
	}




	public int getid() {
		return id;
	}


	public void setid(int id) {
		this.id = id;
	}


	public String getdate() {
		return date;
	}


	public void setdate(String date) {
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


	public String getStatutInscruption() {
		return StatutInscruption;
	}


	public void setStatutInscruption(String statutInscruption) {
		StatutInscruption = statutInscruption;
	}
	
	


	

	
}

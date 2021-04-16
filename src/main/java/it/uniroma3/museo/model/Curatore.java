package it.uniroma3.museo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Curatore extends Persona{

	private String email;
	private int numeroDiTelefono;
	@Column(nullable = false)
	private String matricola;
	
	/*ASSOCIAZIONI*/
	@OneToMany(mappedBy = "curatore") 
	@OrderBy("creationTime desc")  //ordino le collezioni curate in ordine temporale dalla più recente
	private List<Collezione> collezioniGestite;
	
	/*COSTRUTTORI*/
	public Curatore() {
		this.collezioniGestite = new ArrayList<Collezione>();
		
	}
	
	/*GETTERS & SETTERS*/
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumeroDiTelefono() {
		return numeroDiTelefono;
	}

	public void setNumeroDiTelefono(int numeroDiTelefono) {
		this.numeroDiTelefono = numeroDiTelefono;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public List<Collezione> getCollezioniGestite() {
		return collezioniGestite;
	}

	public void setCollezioniGestite(List<Collezione> collezioniGestite) {
		this.collezioniGestite = collezioniGestite;
	}
	
	public void aggiungiCollezione(Collezione c) {
		this.collezioniGestite.add(c);
	}
	
	public void rimuoviCollezione(Collezione c) {
		this.collezioniGestite.remove(c);
	}
}

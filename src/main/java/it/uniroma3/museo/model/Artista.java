package it.uniroma3.museo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Artista extends Persona{
	
	private LocalDate dataDiMorte;
	private String luogoDiMorte;
	private String nazionalità;
	
	/*ASSOCIAZIONI*/
	@OneToMany(mappedBy = "autore", cascade=CascadeType.REMOVE)
	@OrderBy("anno desc") //dall'opera più recente
	private List<Opera> opereCreate;
	
	/*COSTRUTTORI*/
	public Artista() {
		this.opereCreate = new ArrayList<Opera>();
		
	}

	/*GETTERS & SETTERS*/
	public LocalDate getDataDiMorte() {
		return dataDiMorte;
	}

	public void setDataDiMorte(LocalDate dataDiMorte) {
		this.dataDiMorte = dataDiMorte;
	}

	public String getLuogoDiMorte() {
		return luogoDiMorte;
	}

	public void setLuogoDiMorte(String luogoDiMorte) {
		this.luogoDiMorte = luogoDiMorte;
	}

	public String getNazionalità() {
		return nazionalità;
	}

	public void setNazionalità(String nazionalità) {
		this.nazionalità = nazionalità;
	}

	public List<Opera> getOpere() {
		return opereCreate;
	}

	public void setOpere(List<Opera> opere) {
		this.opereCreate = opere;
	}
	
	public void aggiungiOpera(Opera o) {
		this.opereCreate.add(o);
	}
	
	public void rimuoviOpera(Opera o) {
		this.opereCreate.remove(o);
	}
	
}

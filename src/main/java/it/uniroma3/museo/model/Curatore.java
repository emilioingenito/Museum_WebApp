package it.uniroma3.museo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Entity
@EqualsAndHashCode(callSuper=true)
public @Data class Curatore extends Persona{

	private String email;
	private int numeroDiTelefono;
	@NonNull
	private String matricola;
	
	/*ASSOCIAZIONI*/
	@OneToMany(mappedBy = "curatore") 
	@OrderBy("creationTime desc")  //ordino le collezioni curate in ordine temporale dalla più recente
	private List<Collezione> collezioniGestite;
	
	/*COSTRUTTORI*/
	public Curatore() {
		this.collezioniGestite = new ArrayList<Collezione>();
		
	}
	
}

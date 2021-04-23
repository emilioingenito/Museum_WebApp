package it.uniroma3.museo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@NoArgsConstructor
public @Data class Opera {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NonNull
	private String titolo;
	@NonNull
	private String anno;	//stringa - se l'anno non è conosciuto sarà "sconosciuto"
	private String descrizione;
	
	/*ASSOCIAZIONI*/
	@ManyToOne
	private Collezione collezione;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Artista autore;
	
	
}

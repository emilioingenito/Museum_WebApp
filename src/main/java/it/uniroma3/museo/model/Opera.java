package it.uniroma3.museo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public @Data class Opera {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String titolo;
	@Column(nullable = false)
	private String anno;	//stringa - se l'anno non è conosciuto sarà "sconosciuto"
	private String descrizione;
	
	/*ASSOCIAZIONI*/
	@ManyToOne
	private Collezione collezione;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Artista autore;
	
	
}

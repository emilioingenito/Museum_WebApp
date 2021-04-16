package it.uniroma3.museo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Opera {
	
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
	
	/*COSTRUTTORI*/
	public Opera() {
	}

	/*GETTERS & SETTERS*/
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Collezione getCollezione() {
		return collezione;
	}

	public void setCollezione(Collezione collezione) {
		this.collezione = collezione;
	}

	public Artista getAutore() {
		return autore;
	}

	public void setAutore(Artista autore) {
		this.autore = autore;
	}
	
}

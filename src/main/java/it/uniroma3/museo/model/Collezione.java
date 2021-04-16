package it.uniroma3.museo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Collezione {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String nome;
	private String descrizione;
	
	/*ASSOCIAZIONI*/
	@ManyToOne
	private Curatore curatore;
	
	@OneToMany(mappedBy = "collezione")
	@OrderBy("titolo asc") //ordina in base all'attributo title di artPiece
	private List<Opera> opere;
	
	/*COSTRUTTORI*/
	public Collezione() {
		this.opere = new ArrayList<Opera>();
		
	}

	/*GETTERS & SETTERS*/
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Curatore getCuratore() {
		return curatore;
	}

	public void setCuratore(Curatore curatore) {
		this.curatore = curatore;
	}

	public List<Opera> getOpere() {
		return opere;
	}

	public void setOpere(List<Opera> opere) {
		this.opere = opere;
	}

	public void aggiungiOpera(Opera o) {
		this.opere.add(o);
	}
	
	public void rimuoviOpera(Opera o) {
		this.opere.remove(o);
	}
}


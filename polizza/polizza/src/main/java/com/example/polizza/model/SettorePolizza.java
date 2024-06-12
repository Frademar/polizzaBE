package com.example.polizza.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class SettorePolizza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	@Column(columnDefinition = "TEXT")
	private String descrizione;
	@ManyToOne
	@JoinColumn(name = "tipologia_id")
	private TipologiaPolizza tipologia;
	
	@JsonIgnore
	@OneToMany(mappedBy = "settore")
	private List<Polizza> polizza;
	
	public SettorePolizza() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public TipologiaPolizza getTipologia() {
		return tipologia;
	}

	public void setTipologia(TipologiaPolizza tipologia) {
		this.tipologia = tipologia;
	}

	public List<Polizza> getPolizza() {
		return polizza;
	}

	public void setPolizza(List<Polizza> polizza) {
		this.polizza = polizza;
	}
	
	
}

package com.example.polizza.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class TipologiaPolizza {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	@Column(columnDefinition = "TEXT")
	private String descrizione;
	
	@JsonIgnore
	@OneToMany(mappedBy = "tipologia")
	private List<SettorePolizza> settorePolizza;

	public TipologiaPolizza() {
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

	public List<SettorePolizza> getSettorePolizza() {
		return settorePolizza;
	}

	public void setSettorePolizza(List<SettorePolizza> settorePolizza) {
		this.settorePolizza = settorePolizza;
	}
	
	
}

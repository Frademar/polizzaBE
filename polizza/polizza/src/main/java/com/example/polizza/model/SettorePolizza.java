package com.example.polizza.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

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
	
	
	
	
}

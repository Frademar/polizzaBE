package com.example.polizza.model;




import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Pattern;

@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cognome;
    private double portafoglio;

    @Pattern(regexp = "^[0-9]{2}/[0-9]{2}$", message = "Regex della data non eseguita bene")
    private String dataScadenza;
    private int cvc;
    private String numeroCarta;
    @JsonIgnore
    @OneToMany(mappedBy = "utente")
    private List<Polizza> listaPolizze;

    public Utente() {
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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public double getPortafoglio() {
        return portafoglio;
    }

    public void setPortafoglio(double portafoglio) {
        this.portafoglio = portafoglio;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public String getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(String numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public List<Polizza> getListaPolizze() {
        return listaPolizze;
    }

    public void setListaPolizze(List<Polizza> listaPolizze) {
        this.listaPolizze = listaPolizze;
    }

	public String getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(String dataScadenza) {
		this.dataScadenza = dataScadenza;
	}
    
}

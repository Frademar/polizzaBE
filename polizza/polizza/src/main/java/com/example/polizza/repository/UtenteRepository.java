package com.example.polizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.polizza.model.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long>{

}

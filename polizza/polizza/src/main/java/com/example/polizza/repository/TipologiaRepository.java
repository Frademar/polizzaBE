package com.example.polizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.polizza.model.TipologiaPolizza;

@Repository
public interface TipologiaRepository extends JpaRepository<TipologiaPolizza, Long>{

}

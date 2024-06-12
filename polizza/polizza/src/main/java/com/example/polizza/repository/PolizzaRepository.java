package com.example.polizza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.polizza.model.Polizza;

@Repository
public interface PolizzaRepository extends JpaRepository<Polizza, Long>{

	List<Polizza> findBySettoreId_Nome(String settore);

}

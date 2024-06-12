package com.example.polizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.polizza.model.Polizza;
import com.example.polizza.repository.PolizzaRepository;

@Service
public class PolizzaService {

	@Autowired
	private PolizzaRepository polizzaRepository;

	public List<Polizza> prelevaPolizze(String settore) {
		return 	this.polizzaRepository.findBySettoreId_Nome(settore);
	}
}

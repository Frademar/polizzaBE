package com.example.polizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.polizza.repository.PolizzaRepository;

@Service
public class PolizzaService {

	@Autowired
	private PolizzaRepository polizzaRepository;
}

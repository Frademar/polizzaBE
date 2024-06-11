package com.example.polizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.polizza.model.TipologiaPolizza;
import com.example.polizza.repository.TipologiaRepository;

@Service
public class TipologiaService {

	@Autowired
	private TipologiaRepository tipologiaRepository;

	public List<TipologiaPolizza> prelevaTipologia() {
		return this.tipologiaRepository.findAll();
	}
}

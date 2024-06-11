package com.example.polizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.polizza.model.SettorePolizza;
import com.example.polizza.repository.SettoreRepository;

@Service
public class SettoreService {

	@Autowired
	private SettoreRepository settoreRepository;

	public List<SettorePolizza> prelevaSettore(long id) {
		return settoreRepository.findByTipologiaId_Id(id);
	}
}

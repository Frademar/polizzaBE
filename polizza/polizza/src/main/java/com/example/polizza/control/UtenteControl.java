package com.example.polizza.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.polizza.service.UtenteService;

@CrossOrigin
@RestController
@RequestMapping("/api/utente/")
public class UtenteControl {

	@Autowired
	private UtenteService utenteService;
	
	
}

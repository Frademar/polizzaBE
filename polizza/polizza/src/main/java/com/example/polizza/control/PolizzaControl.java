package com.example.polizza.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.polizza.service.PolizzaService;

@CrossOrigin
@RestController
@RequestMapping("/api/polizza/")
public class PolizzaControl {

	@Autowired
	private PolizzaService polizzaService;
}

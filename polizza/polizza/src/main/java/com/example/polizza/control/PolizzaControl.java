package com.example.polizza.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.polizza.model.Polizza;
import com.example.polizza.service.PolizzaService;

@CrossOrigin
@RestController
@RequestMapping("/api/polizza/")
public class PolizzaControl {

	@Autowired
	private PolizzaService polizzaService;
	
	@GetMapping("prelevaPolizze/{settore}")
	public List<Polizza> prelevaPolizze(@PathVariable String settore){
		return this.polizzaService.prelevaPolizze(settore);
	}
}

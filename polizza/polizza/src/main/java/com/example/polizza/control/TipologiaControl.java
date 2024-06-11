package com.example.polizza.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.polizza.model.TipologiaPolizza;
import com.example.polizza.service.TipologiaService;

@CrossOrigin
@RestController
@RequestMapping("/api/tipologia/")
public class TipologiaControl {

	@Autowired
	private TipologiaService tipologiaService;
	
	@GetMapping("prelevaTipologia")
	public List<TipologiaPolizza> prelevaTipologia(){
		return this.tipologiaService.prelevaTipologia();
	}
}

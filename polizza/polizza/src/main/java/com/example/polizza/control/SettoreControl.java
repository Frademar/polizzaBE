package com.example.polizza.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.polizza.model.SettorePolizza;
import com.example.polizza.service.SettoreService;

@CrossOrigin
@RestController
@RequestMapping("/api/settore/")
public class SettoreControl {

	@Autowired
	private SettoreService settoreService;
	
	@GetMapping("prelevaSettore/{id}")
	public List<SettorePolizza> prelevaSettore(@PathVariable long id){
		return this.settoreService.prelevaSettore(id);
	}
}

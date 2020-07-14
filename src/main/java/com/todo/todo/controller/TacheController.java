package com.todo.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.todo.entity.*;
import com.todo.todo.service.*;

@RestController
@RequestMapping(path="/api/tache")
public class TacheController {
	@Autowired
	private TacheService tacheService;
	
	@GetMapping("/")
	public List<Tache> getTaches() {
		return tacheService.retrieveTaches();
	}
	
	@GetMapping("/{id}")
	public Tache getTache(@PathVariable(name = "id") int id) {
		return tacheService.getTache(id);
	}
	
	@PostMapping("/")
	public void saveTache(Tache tache) {
		tacheService.saveTache(tache);
		System.out.println("Tache Saved Successfully");
	}
	
	@DeleteMapping("/{id}")
	public void deleteTache(@PathVariable(name = "id") int id) {
		tacheService.deleteTache(id);
		System.out.println("Tache Deleted Successfully");
	}
}

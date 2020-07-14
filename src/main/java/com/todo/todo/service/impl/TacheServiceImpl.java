package com.todo.todo.service.impl;

import com.todo.todo.service.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.todo.entity.*;
import com.todo.todo.repository.*;

@Service
public class TacheServiceImpl implements TacheService{
	@Autowired
	 private TacheRepository tacheRepository;
	
	public void setTacheRepository(TacheRepository tacheRepository) {
		this.tacheRepository = tacheRepository;
	}

	public List<Tache> retrieveTaches() {
		List<Tache> tache = tacheRepository.findAll();
		 return tache;
	}

	public Tache getTache(int tacheId) {
		Optional<Tache> optTache = tacheRepository.findById(tacheId);
		return optTache.get();
	}

	public void saveTache(Tache tache) {
		tacheRepository.save(tache);
	}

	public void deleteTache(int tacheId) {
		tacheRepository.deleteById(tacheId);
	}

	public void updateTache(Tache Tache) {
		// TODO Auto-generated method stub
		
	}

}

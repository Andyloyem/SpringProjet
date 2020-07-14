package com.todo.todo.service;

import java.util.List;

import com.todo.todo.entity.*;

public interface TacheService {
	
	public List<Tache> retrieveTaches();
	  
	 public Tache getTache(int tacheId);
	  
	 public void saveTache(Tache tache);
	  
	 public void deleteTache(int tacheId);
	  
	 public void updateTache(Tache Tache);
}

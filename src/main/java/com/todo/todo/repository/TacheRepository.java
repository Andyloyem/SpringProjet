package com.todo.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.todo.entity.*;

@Repository
public interface TacheRepository extends  JpaRepository<Tache, Integer>{

}

package com.example.Practica7.repository;

import com.example.Practica7.model.UserTable;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserTable, Long> { }

package com.example.Practica7.repository;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import com.example.Practica7.model.ResponseTable;

import static org.assertj.core.api.BDDAssertions.then;

@Transactional
@SpringBootTest
public class ResponseRepositoryTest {

	/*
	@Autowired
	private ResponseRepository responseRepository;

	private ResponseTable create() {
		String option = "Si";
		Long answer =  (long) 10;
		ResponseTable element = new ResponseTable(option,answer);
		return element;
	}

	@Test
	public void given_repository_when_add_then_Ok() {

		//Given
		var counterBefore = responseRepository.count();
		var element = create();

		//When
		responseRepository.save(element);

		//Then
		var counterAfter = responseRepository.count();
		then(counterAfter).isEqualTo(++counterBefore);
	}
	*/

}

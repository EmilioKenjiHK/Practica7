package com.example.Practica7.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import com.example.Practica7.model.UserTable;

import static org.assertj.core.api.BDDAssertions.then;

@Transactional
@SpringBootTest
public class UserRepositoryTest {

	/*
	@Autowired
	private UserRepository UserRepository;

	private UserTable create() {
		String name = "name";
        String surname = "surname";
		LocalDate date = LocalDate.parse("2000-01-01");
		UserTable element = new UserTable(name,surname,date);
		return element;
	}

	@Test
	public void given_repository_when_add_then_Ok() {

		//Given
		var counterBefore = UserRepository.count();
		var element = create();

		//When
		UserRepository.save(element);

		//Then
		var counterAfter = UserRepository.count();
		then(counterAfter).isEqualTo(++counterBefore);
	}
	*/

}

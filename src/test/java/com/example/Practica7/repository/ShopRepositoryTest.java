package com.example.Practica7.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import com.example.Practica7.model.ShopTable;

import static org.assertj.core.api.BDDAssertions.then;

@Transactional
@SpringBootTest
public class ShopRepositoryTest {

	/*
	@Autowired
	private ShopRepository ShopRepository;

	private ShopTable create() {
		Long id = (long) 1;
		String item = "item";
        BigDecimal price = new BigDecimal("12.5");
		Long quantity = (long) 3;

		ShopTable element = new ShopTable(id,item,price,quantity,false);
		return element;
	}

	@Test
	public void given_repository_when_add_then_Ok() {

		//Given
		var counterBefore = ShopRepository.count();
		var element = create();

		//When
		ShopRepository.save(element);

		//Then
		var counterAfter = ShopRepository.count();
		then(counterAfter).isEqualTo(++counterBefore);
	}
	*/

}
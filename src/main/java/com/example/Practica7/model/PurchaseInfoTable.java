package com.example.Practica7.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseInfoTable {

	private String name;
	private String surname;
    private Long id;
	private String item;
	private BigDecimal price;

}

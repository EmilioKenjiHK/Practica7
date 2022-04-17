package com.example.Practica7.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("SHOP")
public class ShopTable {
	private @Column("ID") Long id;
	private @Column("ITEM") String surname;
	private @Column("PRICE") BigDecimal date;
    private @Column("QUANTITY") Long quantity;
    private @Column("SOLD") Boolean sold;
}


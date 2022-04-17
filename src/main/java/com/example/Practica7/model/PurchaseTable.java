package com.example.Practica7.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("PURCHASE")
public class PurchaseTable {
	private @Column("ID") Long id;
	private @Column("U_NAME1") String user_name;
	private @Column("U_SURNAME1") String user_surname;
}

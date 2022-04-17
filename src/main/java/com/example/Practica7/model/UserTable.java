package com.example.Practica7.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("USER")
public class UserTable {
	private @Column("NAME1") String name;
	private @Column("SURNAME1") String surname;
	private @Column("VISIT_DATE") LocalDate date;
	private @Column("OPTIONS") String option;
}

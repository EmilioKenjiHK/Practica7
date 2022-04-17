package com.example.Practica7.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("RESPONSE")
public class ResponseTable {
	private @Column("OPTIONS") String option;
	private @Column("ANSWER") Long answer;

	public Long getLong()
	{
	return this.answer;
	}

}



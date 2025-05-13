package com.funcionarios.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cliente")
public class cliente { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "email", nullable = false, length = 255)
	private String email;
	
	@Column(name = "nome", nullable = false, length = 255)
	private String nome;
	
	@Column(name = "telefone", nullable = false, length = 255)
	private String telefone;	

}


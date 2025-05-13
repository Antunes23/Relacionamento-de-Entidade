package com.pessoas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PessoaFisica")

public class PessoaFis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "cpf", nullable = false, length = 100)
	private String cpf;
	
	@ManyToOne
	@JoinColumn(name = "id_Venda", nullable = false)
	private Venda venda;
}



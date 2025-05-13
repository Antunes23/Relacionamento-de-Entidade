package com.pessoas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vendas")

public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String numero;
	
	@Column(name = "data", nullable = false, length = 100)
	private String data;
	
	@OneToMany
	@JoinColumn(name = "id_PessoaJur", nullable = false)
	private PessoaJur pessoaJur;



}

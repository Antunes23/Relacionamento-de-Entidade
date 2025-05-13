package com.funcionarios.entities;

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
@Table(name = "produto")
public class Produto { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "descricao", nullable = false, length = 100)
	private String descricao;
	
	@Column(name = "nome", nullable = false, length = 255)
	private String nome;
	
	@Column(name = "preco", nullable = false, length = 255)
	private Double preco;
	
	@ManyToOne
	@JoinColumn(name = "id_itemvenda", nullable = false)
	private itemvenda itemvenda;
	
	

}


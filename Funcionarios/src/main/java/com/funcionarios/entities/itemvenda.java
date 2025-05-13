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
@Table(name = "itemvenda")
public class itemvenda { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "quantidade")
	private double quantidade;
	
	@Column(name = "valor_unitario")
	private double valor_unitario;
	
	@Column(name = "produto_id", nullable = false, length = 255)
	private long produto_id;
	
	@Column(name = "venda_id" , nullable = false)
	private long venda_id;
	
	@ManyToOne
	@JoinColumn(name = "id_venda", nullable = false)
	private venda venda;
	
	

}


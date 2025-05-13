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
@Table(name = "venda")
public class venda { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "data_venda", nullable = false, length = 100)
	private String data_venda;
	
	@Column(name = "cliente_id" , nullable = false)
	private long cliente_id;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false)
	private cliente cliente;
	
	

}


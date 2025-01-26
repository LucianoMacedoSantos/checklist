package com.checklist.checklist.entities;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_viagem")
public class Viagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idViagem;  
	
	@ManyToOne
	@JoinColumn(name = "idPassageiro", nullable = false)
    private int idPassageiro;  
	
	@ManyToOne
    @JoinColumn(name = "idMotorista", nullable = false)
    private int idMotorista;  
	
	@Column(nullable = false)
    private int idCidade;  
	
	@Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusViagem statusViagem;
	
	@Column(nullable = false)
    private LocalDate dataSolicViagem;
    
    public Viagem() {
    	
    }

	public Viagem(int idViagem, int idPassageiro, int idMotorista, int idCidade, StatusViagem statusViagem,
			LocalDate dataSolicViagem) {
		this.idViagem = idViagem;
		this.idPassageiro = idPassageiro;
		this.idMotorista = idMotorista;
		this.idCidade = idCidade;
		this.statusViagem = statusViagem;
		this.dataSolicViagem = dataSolicViagem;
	}

	public int getIdViagem() {
		return idViagem;
	}

	public void setIdViagem(int idViagem) {
		this.idViagem = idViagem;
	}

	public int getIdPassageiro() {
		return idPassageiro;
	}

	public void setIdPassageiro(int idPassageiro) {
		this.idPassageiro = idPassageiro;
	}

	public int getIdMotorista() {
		return idMotorista;
	}

	public void setIdMotorista(int idMotorista) {
		this.idMotorista = idMotorista;
	}

	public int getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}

	public StatusViagem getStatusViagem() {
		return statusViagem;
	}

	public void setStatusViagem(StatusViagem statusViagem) {
		this.statusViagem = statusViagem;
	}

	public LocalDate getDataSolicViagem() {
		return dataSolicViagem;
	}

	public void setDataSolicViagem(LocalDate dataSolicViagem) {
		this.dataSolicViagem = dataSolicViagem;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idViagem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Viagem other = (Viagem) obj;
		return Objects.equals(idViagem, other.idViagem);
	}
}

enum StatusViagem {
    CONCLUIDA,
    CANC_MOTORISTA,
    CANC_PASSAGEIRO;
}

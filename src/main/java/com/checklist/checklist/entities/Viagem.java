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
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_viagem")
public class Viagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idViagem;
	
	@Column(nullable = false)
    private Long idPassageiro;
	
	@Column(nullable = false)
    private Long idMotorista;
	
	@Column(nullable = false)
    private Long idCidade;
	
	@Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusViagem statusViagem;
	
	@Column(nullable = false)
    private LocalDate dataSolicViagem;
    
    public Viagem() {
    	
    }

	public Viagem(Long idViagem, Long idPassageiro, Long idMotorista, Long idCidade, StatusViagem statusViagem,
			LocalDate dataSolicViagem) {
		this.idViagem = idViagem;
		this.idPassageiro = idPassageiro;
		this.idMotorista = idMotorista;
		this.idCidade = idCidade;
		this.statusViagem = statusViagem;
		this.dataSolicViagem = dataSolicViagem;
	}

	public Long getIdViagem() {
		return idViagem;
	}

	public void setIdViagem(Long idViagem) {
		this.idViagem = idViagem;
	}

	public Long getIdPassageiro() {
		return idPassageiro;
	}

	public void setIdPassageiro(Long idPassageiro) {
		this.idPassageiro = idPassageiro;
	}

	public Long getIdMotorista() {
		return idMotorista;
	}

	public void setIdMotorista(Long idMotorista) {
		this.idMotorista = idMotorista;
	}

	public Long getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Long idCidade) {
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

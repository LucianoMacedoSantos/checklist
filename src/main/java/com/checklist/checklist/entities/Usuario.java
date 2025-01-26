package com.checklist.checklist.entities;

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
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;  

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoUsuario tipoUsuario;  
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ListaBloqueio listaBloqueio;

    public Usuario() {
    }

    public Usuario(int idUsuario, TipoUsuario tipoUsuario, ListaBloqueio listaBloqueio) {
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
        this.listaBloqueio = listaBloqueio;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public ListaBloqueio getListaBloqueio() {
        return listaBloqueio;
    }

    public void setListaBloqueio(ListaBloqueio listaBloqueio) {
        this.listaBloqueio = listaBloqueio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        return Objects.equals(idUsuario, other.idUsuario);
    }
}

enum TipoUsuario {
    PASSAGEIRO,
    MOTORISTA,
    PARCEIRO;
}

enum ListaBloqueio {
    SIM,
    NAO;
}

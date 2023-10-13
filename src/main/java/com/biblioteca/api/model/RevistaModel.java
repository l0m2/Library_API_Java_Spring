package com.biblioteca.api.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "Revistas")
public class RevistaModel extends PublicacaoModel implements Serializable {
    @Column(nullable = true)
    private String periodicidade;

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }
}

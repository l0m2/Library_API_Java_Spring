package com.biblioteca.api.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class PublicacaoModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID publicacao_id;
    @Column(nullable = true)
    private String catalogacao;

    public UUID getPublicacao_id() {
        return publicacao_id;
    }

    public void setPublicacao_id(UUID publicacao_id) {
        this.publicacao_id = publicacao_id;
    }

    public String getCatalogacao() {
        return catalogacao;
    }

    public void setCatalogacao(String catalogacao) {
        this.catalogacao = catalogacao;
    }
}

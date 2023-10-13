package com.biblioteca.api.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "Fichas_Emprestimos")
public class FichaEmprestimoModel implements Serializable {
     private static final long ver=1L;

     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID ficha_id;
     @Column(nullable = false, unique = true)
    private String bi;
     @Column(nullable = true)
     private String nome;
     @ManyToOne
     @JoinColumn(name = "publicacao_id")
     private PublicacaoModel publicacao_id;

    public UUID getFicha_id() {
        return ficha_id;
    }

    public void setFicha_id(UUID ficha_id) {
        this.ficha_id = ficha_id;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PublicacaoModel getPublicacao_id() {
        return publicacao_id;
    }

    public void setPublicacao_id(PublicacaoModel publicacao_id) {
        this.publicacao_id = publicacao_id;
    }
}

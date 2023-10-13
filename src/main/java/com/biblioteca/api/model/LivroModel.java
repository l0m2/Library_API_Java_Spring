package com.biblioteca.api.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "Livros")
public class LivroModel extends  PublicacaoModel implements Serializable {
    @Column(nullable = true)
    private String ISBN;
    @Column(nullable = true)
    private String autor;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

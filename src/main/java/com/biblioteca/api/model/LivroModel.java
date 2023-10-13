package com.biblioteca.api.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Livros")
public class LivroModel extends  PublicacaoModel{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID livro_id;
    @Column(nullable = true)
    private String ISBN;
    @Column(nullable = true)
    private String autor;

    public UUID getLivro_id() {
        return livro_id;
    }

    public void setLivro_id(UUID livro_id) {
        this.livro_id = livro_id;
    }

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

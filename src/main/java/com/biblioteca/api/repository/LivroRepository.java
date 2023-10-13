package com.biblioteca.api.repository;

import com.biblioteca.api.model.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LivroRepository extends JpaRepository<LivroModel, UUID> {
}

package com.biblioteca.api.repository;

import com.biblioteca.api.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, UUID> {
    Optional<FuncionarioModel> findUser(String Nome);
}

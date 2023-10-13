package com.biblioteca.api.repository;

import com.biblioteca.api.model.PublicacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PublicacaoRepository extends JpaRepository<PublicacaoModel, UUID> {
}

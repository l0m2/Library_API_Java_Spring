package com.biblioteca.api.repository;

import com.biblioteca.api.model.RevistaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RevistaRepository extends JpaRepository<RevistaModel, UUID> {
}

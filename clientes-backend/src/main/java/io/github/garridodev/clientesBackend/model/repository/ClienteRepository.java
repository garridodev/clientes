package io.github.garridodev.clientesBackend.model.repository;

import io.github.garridodev.clientesBackend.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}

package io.github.garridodev.clientesBackend.model.repository;

import io.github.garridodev.clientesBackend.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}

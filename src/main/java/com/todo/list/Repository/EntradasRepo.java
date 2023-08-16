package com.todo.list.Repository;

import com.todo.list.Models.Entradas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntradasRepo extends JpaRepository<Entradas, Long> {
}

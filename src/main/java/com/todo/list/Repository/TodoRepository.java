package com.todo.list.Repository;

import com.todo.list.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TodoRepository  extends JpaRepository<Producto, Long> {

}

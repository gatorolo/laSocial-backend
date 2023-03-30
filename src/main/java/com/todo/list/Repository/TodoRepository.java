package com.todo.list.Repository;

import com.todo.list.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TodoRepository  extends JpaRepository<Task, Long> {

}

package com.todo.list.Controller;


import com.todo.list.Models.Task;
import com.todo.list.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class todoController {
      @Autowired
      private TodoRepository todoRepository;

      @GetMapping("/all")
        public List<Task> getTasks(){
          return todoRepository.findAll();
      }


      @PostMapping("/add")
        public String saveTask(@RequestBody Task task) {
          todoRepository.save(task);
          return "saved task";
      }

      @PutMapping("/update")
        public String updateTask( @RequestBody Task task) {
          todoRepository.save(task);
          return "updated task";
      }

      @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable long id) {
          Task deletedTask = todoRepository.findById(id).get();
             todoRepository.delete(deletedTask);
          return "deleted task";
      }
}

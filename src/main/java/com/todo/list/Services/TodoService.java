package com.todo.list.Services;


import com.todo.list.Models.Producto;
import com.todo.list.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TodoService {
    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Producto addProduct(Producto producto){
        return todoRepository.save(producto);
    }
    public List<Producto> getProduct(){
        return todoRepository.findAll();
    }
    public Producto updateProduct(Producto producto){
        return todoRepository.save(producto);
    }

    public void deleteProduct(Long id){
        todoRepository.deleteById(id);
    }

}

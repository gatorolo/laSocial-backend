package com.todo.list.Controller;


import com.todo.list.Models.Producto;
import com.todo.list.Services.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class todoController {

      private final TodoService todoService;

    public todoController(TodoService todoService) {
        this.todoService = todoService;
    }



    @GetMapping("/all")
        public ResponseEntity<List<Producto>>  getProduct(){
         List<Producto>  productos = todoService.getProduct();
          return new ResponseEntity<>(productos, HttpStatus.OK);
      }


      @PostMapping("/add")
        public ResponseEntity<Producto> saveProduct(@RequestBody Producto producto) {
         Producto nuevoProducto = todoService.addProduct(producto);
          return new ResponseEntity<>(nuevoProducto, HttpStatus.CREATED);
      }

      @PutMapping("/update")
        public ResponseEntity<Producto> updateProduct(@RequestBody Producto producto) {
          Producto updateProducto = todoService.updateProduct(producto);
          return new ResponseEntity<>(updateProducto, HttpStatus.OK);
      }

      @DeleteMapping("/delete/{id}")
       public ResponseEntity<?> deleteProduct(@PathVariable("id") long id) {
           todoService.deleteProduct(id);
          return new ResponseEntity<>(HttpStatus.OK);
      }
}

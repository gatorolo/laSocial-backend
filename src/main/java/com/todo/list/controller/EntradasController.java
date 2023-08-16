package com.todo.list.controller;

import com.todo.list.Models.Entradas;
import com.todo.list.Services.EntradasService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entradas")
public class EntradasController {

    private final EntradasService entradasService;

    public EntradasController(EntradasService entradasService) {
        this.entradasService = entradasService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Entradas>> getEntradas() {
        List<Entradas> obtener = entradasService.getEntradas();
        return new ResponseEntity<>(obtener, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Entradas> addEntradas(@RequestBody Entradas entradas) {
        Entradas add = entradasService.addEntrada(entradas);
        return new ResponseEntity<>(add, HttpStatus.OK);
    }

    @PutMapping("/edit")
    public ResponseEntity<Entradas> editEntradas(@RequestBody Entradas entradas) {
        Entradas edit = entradasService.editEntrada(entradas);
        return new ResponseEntity<>(edit, HttpStatus.OK);
    }



    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEntradas(@PathVariable("id") long id) {
        entradasService.deleteEntradas(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}

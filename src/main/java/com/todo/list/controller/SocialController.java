package com.todo.list.controller;

import com.todo.list.Models.Social;
import com.todo.list.Services.SocialService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/social")
public class SocialController {

    private final SocialService socialService;
    public SocialController(SocialService socialService) {
        this.socialService = socialService;
    }


    @PutMapping("/update")
    public ResponseEntity<Social> editarSocial(@RequestBody Social social){
        Social updateSocial = socialService.editarSocial(social);
        return new ResponseEntity<>(updateSocial, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Social>> getSocial(){
        List<Social>  socials = socialService.buscarSocial();
        return new ResponseEntity<>(socials, HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<Social> crearSocial(@RequestBody Social social){
        Social nuevaSocial=socialService.addSocial(social);
        return new ResponseEntity<>(nuevaSocial, HttpStatus.CREATED);
    }



    @DeleteMapping("/delete/{id}")
   public ResponseEntity<?> borrarSocial(@PathVariable("id") Long id){
        socialService.borrarSocial(id);
       return new ResponseEntity<>(HttpStatus.OK);
    }


}

package com.todo.list.Services;


import com.todo.list.Models.Entradas;
import com.todo.list.Repository.EntradasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EntradasService {

    private final EntradasRepo entradasRepo;

    @Autowired
    public EntradasService(EntradasRepo entradasRepo) {
        this.entradasRepo = entradasRepo;
    }

    public List<Entradas>  getEntradas() {
        return  entradasRepo.findAll();
    }

    public Entradas addEntrada(Entradas entradas) {
        return entradasRepo.save(entradas);
    }

    public Entradas editEntrada(Entradas entradas) {
        return entradasRepo.save(entradas);
    }

    public void deleteEntradas(Long id) {
        entradasRepo.deleteById(id);
    }
}

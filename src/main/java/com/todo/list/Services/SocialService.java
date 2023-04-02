package com.todo.list.Services;

import com.todo.list.Models.Social;
import com.todo.list.Repository.SocialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SocialService {

    private final SocialRepo socialRepo;

    @Autowired
    public SocialService(SocialRepo socialRepo) {
        this.socialRepo = socialRepo;
    }


    public Social addSocial(Social social){
        return socialRepo.save(social);
    }
    public List<Social> buscarSocial(){
        return socialRepo.findAll();
    }
    public Social editarSocial(Social social){
        return socialRepo.save(social);
    }
    public void borrarSocial(Long id){ socialRepo.deleteById(id); }
}

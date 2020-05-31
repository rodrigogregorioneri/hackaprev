package com.hackaprev.app.business;

import com.hackaprev.app.model.PerfilModel;
import com.hackaprev.app.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilBusiness {

    @Autowired
    private PerfilRepository perfilRepository;

    public PerfilModel createPerfil(PerfilModel p){
        return perfilRepository.save(p);
    }

    public List<PerfilModel> listPerfil(){
        return perfilRepository.findAll();
    }

    public PerfilModel findPerfil(String id){
        return perfilRepository.findById(id).get();
    }




}

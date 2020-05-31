package com.hackaprev.app.controller;

import com.hackaprev.app.business.PerfilBusiness;
import com.hackaprev.app.model.PerfilModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/profissionais")
public class PerfilController {

    @Autowired
    private PerfilBusiness perfilBusiness;


    @PostMapping
    public PerfilModel createPerfil(@RequestBody PerfilModel perfil){
        return perfilBusiness.createPerfil(perfil);
    }

    @GetMapping
    public List<PerfilModel> listPerfil(){
        return perfilBusiness.listPerfil();
    }

    @GetMapping("/findProfessional/{id}")
    public PerfilModel findByPerfil(@PathVariable(name = "id", required = true) String id){
        return perfilBusiness.findPerfil(id);
    }

}

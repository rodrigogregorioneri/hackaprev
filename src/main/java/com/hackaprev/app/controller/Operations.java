package com.hackaprev.app.controller;


import com.hackaprev.app.business.PerfilBusiness;
import com.hackaprev.app.model.PerfilModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/operations")
public class Operations {

    @Autowired
    private PerfilBusiness perfilBusiness;



    @GetMapping("/getParcelas/{id}/{valorApagar}")
    public int getParcelas(@PathVariable(name = "id", required = true) String id,@PathVariable(name = "valorApagar", required = true) int valorApagar){

        return perfilBusiness.getParcelas(id,valorApagar);
    }
}

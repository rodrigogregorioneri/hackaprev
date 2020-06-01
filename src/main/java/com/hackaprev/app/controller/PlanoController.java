package com.hackaprev.app.controller;

import com.hackaprev.app.business.PlanoBusiness;
import com.hackaprev.app.model.PlanoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/plano")
public class PlanoController {

    @Autowired
    private PlanoBusiness planoBusiness;

    @PostMapping
    public PlanoModel createPlano(@RequestBody PlanoModel plano){
        return planoBusiness.createPlano(plano);
    }

    @GetMapping
    public List<PlanoModel> listPlano(){
        return planoBusiness.listPlano();
    }

    @GetMapping("/findPlano/{id}")
    public PlanoModel findByPlano(@PathVariable(name = "id", required = true) String id){
        return planoBusiness.findPlano(id);
    }


}

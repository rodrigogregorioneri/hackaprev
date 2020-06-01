package com.hackaprev.app.business;

import com.hackaprev.app.model.PerfilModel;
import com.hackaprev.app.model.PlanoModel;
import com.hackaprev.app.repository.PerfilRepository;
import com.hackaprev.app.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanoBusiness {

    @Autowired
    private PlanoRepository planoRepository;

    public PlanoModel createPlano(PlanoModel p) {
        return planoRepository.save(p);
    }

    public List<PlanoModel> listPlano() {
        return planoRepository.findAll();
    }

    public PlanoModel findPlano(String id) {
        return planoRepository.findById(id).get();

    }
}
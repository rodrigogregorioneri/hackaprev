package com.hackaprev.app.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PlanoModel {

    @Id
    private String id;
    private String valorGuardado;

    private String tempoRestante;

    private String progressoPlano;


}

package com.hackaprev.app.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class PlanoModel {

    @Id
    private String id;
    private String valorGuardado;

    private String tempoRestante;

    private String progressoPlano;


}

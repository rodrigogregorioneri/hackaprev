package com.hackaprev.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PerfilModel {

    @Id
    private String id;

    private String nome;

    private String sobrenome;

    private int idade;

    private String tipoSonho;

    private String valorSonho;

    private String objetivoEmAnos;

}

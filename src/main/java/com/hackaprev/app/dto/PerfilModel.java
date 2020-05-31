package com.hackaprev.app.dto;

import org.springframework.data.annotation.Id;

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

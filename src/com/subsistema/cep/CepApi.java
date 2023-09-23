package com.subsistema.cep;

import com.lab.padroesprojeto.singleton.SingletonEager;

public class CepApi {

    private static final CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        return "Florianópolis";
    }

    public String recuperarEstado(String cep) {
        return "SC";
    }
}

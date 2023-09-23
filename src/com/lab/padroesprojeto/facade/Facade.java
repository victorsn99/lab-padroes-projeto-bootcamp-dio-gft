package com.lab.padroesprojeto.facade;

import com.subsistema.cep.CepApi;
import com.subsistema.crm.CrmService;

/**
 * Padrão de projeto Facade. O objetivo é criar uma interface de consumo simplificada.
 */
public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

    }
}

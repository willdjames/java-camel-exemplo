package com.meu.camel.exemplo.service;

import com.meu.camel.exemplo.camel.CamelContextWrapper;
import com.meu.camel.exemplo.camel.MeuRouterBuilder;
import org.apache.camel.ProducerTemplate;

public class ExemploService {

    ProducerTemplate template;

    public ExemploService(CamelContextWrapper wrapper){
        template = wrapper.getProducerTemplate();
    }

    public void fazAlgo(){
        template.requestBody(MeuRouterBuilder.ROTA_ENTRADA, "Meu_Valor");
    }
}

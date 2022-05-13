package com.meu.camel.exemplo.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MeuRouterBuilderTerceira extends RouteBuilder {

    public static final String ROTA_ENTRADA_TERCEIRA = "direct:rotaEntradaTerceira";
    private static final String ROTA_SEGUNDA_TERCEIRA = "direct:rotaSegundaTerceira";

    @Override
    public void configure() throws Exception {

        from(ROTA_ENTRADA_TERCEIRA)
                .log("Execiutando ROTA_ENTRADA")
                .log("${body}")
                .to(ROTA_SEGUNDA_TERCEIRA)
                .end();

        from(ROTA_SEGUNDA_TERCEIRA)
                .log("Executando ROTA_SEGUNDA");
    }
}

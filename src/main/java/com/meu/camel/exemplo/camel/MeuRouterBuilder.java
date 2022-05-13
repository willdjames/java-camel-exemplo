package com.meu.camel.exemplo.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MeuRouterBuilder extends RouteBuilder {

    public static final String ROTA_ENTRADA = "direct:rotaEntrada";
    private static final String ROTA_SEGUNDA = "direct:rotaSegunda";

    @Override
    public void configure() throws Exception {

        from(ROTA_ENTRADA)
                .log("Execiutando ROTA_ENTRADA")
                .log("${body}")
                .to(ROTA_SEGUNDA)
                .end();

        from(ROTA_SEGUNDA)
                .log("Executando ROTA_SEGUNDA");
    }
}

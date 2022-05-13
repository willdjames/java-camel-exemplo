package com.meu.camel.exemplo.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelContextWrapper {

    private CamelContext context;

    public CamelContextWrapper(RouteBuilder... routeBuilders) throws Exception {

        context = new DefaultCamelContext();

        for (RouteBuilder routeBuilder : routeBuilders) {
            context.addRoutes(routeBuilder);
        }

        context.start();
    }

    public ProducerTemplate getProducerTemplate() {
        return context.createProducerTemplate();
    }
}

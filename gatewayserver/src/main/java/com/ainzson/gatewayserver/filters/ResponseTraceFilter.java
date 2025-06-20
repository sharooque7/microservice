package com.ainzson.gatewayserver.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Configuration
public class ResponseTraceFilter {
    private static final Logger logger  = LoggerFactory.getLogger(RequestTraceFilter.class);

    @Autowired
    FilterUtility filterUtility;

    @Bean
    public GlobalFilter postGlobalFilter() {
        return (exchange, chain) -> {
            return chain.filter(exchange).then(Mono.fromRunnable(()-> {
                HttpHeaders httpHeaders = exchange.getRequest().getHeaders();
                String correlationId = filterUtility.getCorrelationId(httpHeaders);
                if (!(exchange.getResponse().getHeaders().containsKey(filterUtility.CORRELATION_ID))) {
                    logger.debug("Updated the correlation id to the outbound headers: {}", correlationId);

                }
            }));
        };
    }
}

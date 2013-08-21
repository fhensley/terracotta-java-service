package com.anatas.terracotta.gateway;

import java.net.InetSocketAddress;
import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cf.component.http.SimpleHttpServer;
import cf.service.GatewayServer;

import com.anatas.terracotta.Config;

public class Gateway {
    private Gateway() {
        createGateway();
    }

    private void createGateway() {
        try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:yamlPropertiesContext.xml")) {
            final Map<String, Object> yaml = context.getBean("gateway", Map.class);

            try (final SimpleHttpServer server = new SimpleHttpServer(new InetSocketAddress(
                    (Integer) ((Map<String, Object>) yaml.get(Config.GATEWAY.toString())).get(Config.AUTH_TOKEN.toString())))) {

                final TerracottaProvisioner provisioner = new TerracottaProvisioner();
                new GatewayServer(server, provisioner, (String) ((Map<String, Object>) yaml.get(Config.GATEWAY.toString())).get(Config.AUTH_TOKEN.toString()));
            }
        }
    }
}

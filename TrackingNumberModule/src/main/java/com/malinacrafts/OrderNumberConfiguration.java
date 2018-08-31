package com.malinacrafts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;

@Configuration
public class OrderNumberConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("pocztapolska.wsdl");
        return marshaller;
    }

    @Bean
    @Primary
    public PPClient orderNumberClient(Jaxb2Marshaller marshaller) {
        PPClient client = new PPClient();
        client.setInterceptors(new ClientInterceptor[]{securityInterceptor()});
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

    @Bean
    public Wss4jSecurityInterceptor securityInterceptor() {
        Wss4jSecurityInterceptor securityInterceptor = new Wss4jSecurityInterceptor();
        securityInterceptor.setSecurementActions("UsernameToken");
        securityInterceptor.setSecurementMustUnderstand(true);
        securityInterceptor.setSecurementPasswordType("PasswordText");
        securityInterceptor.setSecurementUsername("sledzeniepp");
        securityInterceptor.setSecurementPassword("PPSA");
        return securityInterceptor;
    }



}

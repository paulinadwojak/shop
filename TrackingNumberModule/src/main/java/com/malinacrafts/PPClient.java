package com.malinacrafts;

import org.springframework.stereotype.Component;
import pocztapolska.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Component
public class PPClient extends WebServiceGatewaySupport {

    public SprawdzPrzesylkePlResponse getOrderNumber(String orderNumber) {

        ObjectFactory objectFactory = new ObjectFactory();
        SprawdzPrzesylkePl request = objectFactory.createSprawdzPrzesylkePl();
        request.setNumer(objectFactory.createSprawdzPrzesylkePlNumer(orderNumber));
        SprawdzPrzesylkePlResponse response = (SprawdzPrzesylkePlResponse) getWebServiceTemplate().
                marshalSendAndReceive("https://tt.poczta-polska.pl/Sledzenie/services/Sledzenie", request);

        return response;
    }


}
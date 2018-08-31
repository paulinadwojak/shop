package com.malinacrafts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pocztapolska.wsdl.SprawdzPrzesylkePlResponse;

@Service
public class TrackingNumberClientService {

   @Autowired
   private PPClient client;

    public String checkStatus(String trackingNumber) {

        SprawdzPrzesylkePlResponse response = client.getOrderNumber(trackingNumber);

        return response.getReturn().getValue().getStatus().toString();
    }
}

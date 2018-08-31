package shop.trackingNumber.services;

import com.malinacrafts.TrackingNumberClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackingNumberServiceImpl implements TrackingNumberService {

    @Autowired
    private TrackingNumberClientService trackingNumberClientService;

    @Override
    public void checkStatus(String trackingNumber) {

        trackingNumberClientService.checkStatus(trackingNumber);

        System.out.println(trackingNumberClientService.checkStatus(trackingNumber));
//        metoda checkStatus zwróci Stringa ze statusem przesyłki
    }

    @Override
    public List<String> getNumberTrackingsList() {
        return null;
    }
}

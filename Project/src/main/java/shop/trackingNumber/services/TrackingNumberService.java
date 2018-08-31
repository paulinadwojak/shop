package shop.trackingNumber.services;


import java.util.List;

public interface TrackingNumberService {

    void checkStatus(String string);
    List<String> getNumberTrackingsList();
}

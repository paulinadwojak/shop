package shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import shop.trackingNumber.services.TrackingNumberService;

@Controller
public class TrackingNumberController {

    @Autowired
    private TrackingNumberService trackingNumberService;


    @GetMapping("/trackingnumber")
    public String trackingNumbersList(Model model) {

//        List<String> numberTrackingsList = trackingNumberService.getNumberTrackingsList();
//        model.addAttribute("numberTrackingsList", numberTrackingsList);

        return "trackingnumberForm";
    }

    @PostMapping("/checkStatus")
    public String checkStatus(@ModelAttribute("trackingNumber") String trackingNumber) {

        trackingNumberService.checkStatus(trackingNumber);

        return "trackingnumberForm";
    }

}

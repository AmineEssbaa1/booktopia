package com.example.booktopia.controllers;
import com.example.booktopia.entities.PublishingHouse;
import com.example.booktopia.services.PublishingHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class PublishingHouseController {
    @Autowired
    PublishingHouseService publishingHouseService ;
    @RequestMapping("/createPubHouse")
    public String createPubHouse(){return "CreatePubHouse";}
    @RequestMapping("savePubHouse")
    public String savePubHouse(
            @ModelAttribute("pubHouse") PublishingHouse publishingHouse,
            ModelMap modelMap
    ){
        PublishingHouse memo = publishingHouseService.savePublishingHouse(publishingHouse);
        String messageController = "The Publishing House whose Id :  " + memo.getIdPubHouse() + " is saved";
        modelMap.addAttribute("messageJsp",messageController);
        return "CreatePubHouse";
    }

    @RequestMapping("/pubHousesList")
    public String pubHousesList(ModelMap modelMap){
        List<PublishingHouse> publishingHousesController=publishingHouseService.getAllPublishingHouses();
        modelMap.addAttribute("pubHousesJsp", publishingHousesController);
        return "PubHousesList";
    }

    @RequestMapping ("/showPubHouse")
    public String showPubHouse (@RequestParam("id") Long id, ModelMap modelMap) {
        PublishingHouse publishingHouseController = publishingHouseService.getPublishingHouse(id);
        modelMap.addAttribute("pubHouseJsp", publishingHouseController);
        return "EditPubHouse";
    }

    @RequestMapping("updatePubHouse")
    public String updatePubHouse(
            @ModelAttribute("pubHouse") PublishingHouse publishingHouse){
            PublishingHouse memo = publishingHouseService.savePublishingHouse(publishingHouse);

        return "CreatePubHouse";
    }

    @RequestMapping("/deletePubHouse")
    public String deletePubHouse (@RequestParam("id") Long id, ModelMap modelMap) {
        publishingHouseService.deletePublishingHouseById(id);
        List<PublishingHouse> publishingHousesController=publishingHouseService.getAllPublishingHouses();
        modelMap.addAttribute("pubHousesJsp", publishingHousesController);
        return "PubHousesList";
    }

}

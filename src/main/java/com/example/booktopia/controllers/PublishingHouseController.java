package com.example.booktopia.controllers;
import com.example.booktopia.entities.Author;
import com.example.booktopia.entities.PublishingHouse;
import com.example.booktopia.services.PublishingHouseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
    @RequestMapping("/savePubHouse")
    public String savePubHouse(
            @Valid PublishingHouse publishingHouse, BindingResult bindingResult
    ) { if(bindingResult.hasErrors()) {

        return "CreatePubHouse";
    }
        PublishingHouse memo = publishingHouseService.savePublishingHouse(publishingHouse);
        return "CreatePubHouse";
    }

//    @RequestMapping("/pubHousesList")
//    public String pubHousesList(ModelMap modelMap){
//        List<PublishingHouse> publishingHousesController=publishingHouseService.getAllPublishingHouses();
//        modelMap.addAttribute("pubHousesJsp", publishingHousesController);
//        return "PubHousesList";
//    }

    @RequestMapping("/pubHousesList")
    public String pubHousesList(ModelMap modelMap,
                              @RequestParam(name = "page", defaultValue = "0") int page,
                              @RequestParam(name = "size", defaultValue = "5") int size
    ) {
        Page<PublishingHouse> publishingHousesController = publishingHouseService.getAllPubHousesByPage(page, size);
        modelMap.addAttribute("pubHousesJsp", publishingHousesController);
        modelMap.addAttribute("pages", new int[publishingHousesController.getTotalPages()]);
        modelMap.addAttribute("currentPage", page);
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

//    @RequestMapping("/deletePubHouse")
//    public String deletePubHouse (@RequestParam("id") Long id, ModelMap modelMap,
//                                  @RequestParam(name = "page", defaultValue = "0") int page,
//                                  @RequestParam(name = "size", defaultValue = "5") int size) {
//        publishingHouseService.deletePublishingHouseById(id);
//        List<PublishingHouse> publishingHousesController=publishingHouseService.getAllPublishingHouses();
//        modelMap.addAttribute("pubHousesJsp", publishingHousesController);
//        return "PubHousesList";
//    }

        @RequestMapping("/deletePubHouse")
        public String deletePubHouse(@RequestParam("id") Long id, ModelMap modelMap,
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "5") int size) {
            publishingHouseService.deletePublishingHouseById(id);
            Page<PublishingHouse> pubHousesController = publishingHouseService.getAllPubHousesByPage(page, size);
            modelMap.addAttribute("pubHousesJsp",pubHousesController);
            modelMap.addAttribute("pages",new int[pubHousesController.getTotalPages()]);
            modelMap.addAttribute("currentPage",page);
            return"PubHousesList";

    }

}

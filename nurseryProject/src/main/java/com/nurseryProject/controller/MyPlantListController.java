package com.nurseryProject.controller;

import com.nurseryProject.service.MyPlantListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyPlantListController {

    @Autowired
    private MyPlantListService service;

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") int id){
        service.deleteById(id);
        return "redirect:/my_plants";
    }
}

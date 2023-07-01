package com.nurseryProject.controller;

import com.nurseryProject.entity.MyPlantList;
import com.nurseryProject.entity.Plant;
import com.nurseryProject.service.MyPlantListService;
import com.nurseryProject.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class PlantController {

    @Autowired
    private PlantService service;

    @Autowired
    private MyPlantListService myPlantService;


    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/plant_register")
    public String plantRegister(){
        return "plantRegister";
    }
    @GetMapping("/available_plants")
    public ModelAndView getAllPlant() {
        List<Plant>list = service.getAllPlant();
        ModelAndView m=new ModelAndView();
        m.setViewName("plantList");
        m.addObject("plant",list);
        return new ModelAndView("plantList","plant",list);
    }
    @PostMapping("/save")
    public String addPlant(@ModelAttribute Plant p){
        service.save(p);
        return "redirect:/available_plants";
    }


    @GetMapping("/my_plants")
    public String getMyPlants(Model model){
        List<MyPlantList> list= myPlantService.getAllMyPlants();
        model.addAttribute("plant",list);
        return "myPlants";
    }
    @GetMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id){
        Plant p=service.getPlantById(id);
        MyPlantList mp=new MyPlantList(p.getId(),p.getName(),p.getCategory(),p.getPrice());
        myPlantService.saveMyPlants(mp);
        return "redirect:/my_plants";
    }
    @GetMapping("/editPlant/{id}")
    public String editPlant(@PathVariable("id") int id,Model model){
        Plant p=service.getPlantById(id);
        model.addAttribute("plant",p);
        return "plantEdit";
    }
    @GetMapping("/deletePlant/{id}")
    public String deletePlant(@PathVariable("id")int id){
        service.deleteById(id);
        return "redirect:/available_plants";
    }

}

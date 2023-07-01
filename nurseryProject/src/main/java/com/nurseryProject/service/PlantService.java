package com.nurseryProject.service;

import com.nurseryProject.entity.Plant;
import com.nurseryProject.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantService {
    @Autowired
    private PlantRepository pRepo;
    public void save(Plant p){

        pRepo.save(p);
    }
    public List<Plant> getAllPlant(){

        return pRepo.findAll();
    }
    public Plant getPlantById(int id){
        return pRepo.findById(id).get();
    }
    public void deleteById(int id){
        pRepo.deleteById(id);
    }
}

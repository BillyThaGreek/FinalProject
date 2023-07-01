package com.nurseryProject.service;

import com.nurseryProject.entity.MyPlantList;
import com.nurseryProject.repository.MyPlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyPlantListService {
    @Autowired
    private MyPlantRepository myplant;
    public void saveMyPlants(MyPlantList plant)
    {
        myplant.save(plant);

    }
    public List<MyPlantList> getAllMyPlants(){

        return myplant.findAll();
    }
    public void deleteById(int id){

        myplant.deleteById(id);
    }
}

package com.nurseryProject.repository;

import com.nurseryProject.entity.MyPlantList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyPlantRepository extends JpaRepository<MyPlantList,Integer>{
}

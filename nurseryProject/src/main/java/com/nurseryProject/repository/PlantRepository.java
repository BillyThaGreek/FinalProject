package com.nurseryProject.repository;

import com.nurseryProject.entity.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository extends JpaRepository<Plant,Integer> {
}

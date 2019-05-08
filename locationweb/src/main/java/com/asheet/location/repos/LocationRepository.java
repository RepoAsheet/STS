package com.asheet.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asheet.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

	Location findAllById(int id);

}

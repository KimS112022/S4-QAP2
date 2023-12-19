package com.keyin.airport;

import com.keyin.aircraft.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "airport", path = "airport")
public interface AirportRESTAPI extends JpaRepository<Airport, Long> {
    public List<Airport> findByCode(@RequestParam String code);
}

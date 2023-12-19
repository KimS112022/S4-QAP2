package com.keyin.passenger;

import com.keyin.aircraft.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "passenger", path = "passenger")
public interface PassengerRESTAPI extends JpaRepository<Passenger, Long> {
    public List<Passenger> findByFirstNameAndLastName(@RequestParam String firstName, String lastName);
}

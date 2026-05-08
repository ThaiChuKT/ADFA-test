package com.thaichu.ADFA;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/places")
@CrossOrigin(origins = "*")
public class PlacesController {
    @Autowired
    private PlacesRepo placesRepo;

    @GetMapping("/getAllPlaces")
    public List<Places> getAllPlaces() {
        return placesRepo.findAll();
    }
}

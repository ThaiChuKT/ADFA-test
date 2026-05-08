package com.thaichu.ADFA;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/places")
@CrossOrigin(origins = "*")
public class PlacesController {

    @GetMapping("/getAllPlaces")
    public List<Map<String, Object>> getAllPlaces() {
        return List.of(
            Map.of("id", 1, "name", "Hoi An", "rating", 4.5, "imageUrl", "https://example.com/hoian.jpg"),
            Map.of("id", 2, "name", "Sai gon", "rating", 4.7, "imageUrl", "https://example.com/saigon.jpg")
        );
    }
}

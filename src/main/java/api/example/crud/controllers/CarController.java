package api.example.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.example.crud.dto.CarDTO;
import api.example.crud.models.Car;
import api.example.crud.repositories.CarRepository;

@RestController
@RequestMapping("/api/car")
public class CarController {
    @Autowired
    private CarRepository repository;

    @GetMapping
    public List<Car> listAll() {
        return repository.findAll();
    }

    @PostMapping
    public void create(@RequestBody CarDTO req) {
        repository.save(new Car(req));
    }
}

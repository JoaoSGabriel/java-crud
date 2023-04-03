package api.example.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import api.example.crud.models.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    
}

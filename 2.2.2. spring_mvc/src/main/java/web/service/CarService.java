package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> generateCars();

    List<Car> getCars();

    List<Car> getCars(int amount);
}

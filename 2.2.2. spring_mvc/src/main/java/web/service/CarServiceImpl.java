package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> generateCars() {
        cars = new ArrayList<>();
        cars.add(new Car("Brand1", "Model1", 2001));
        cars.add(new Car("Brand2", "Model2", 2002));
        cars.add(new Car("Brand3", "Model3", 2003));
        cars.add(new Car("Brand4", "Model4", 2004));
        cars.add(new Car("Brand5", "Model5", 2005));
        return cars;
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int amount) {
        return cars.stream().limit(amount).collect(Collectors.toList());
    }
}

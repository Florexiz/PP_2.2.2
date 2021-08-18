package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    CarService carService;

    @RequestMapping()
    public String showCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        List<Car> cars;

        carService.generateCars();
        if (count == null || count >= 5) {
            cars = carService.getCars();
        } else {
            cars = carService.getCars(count);
        }

        model.addAttribute("cars", cars);
        return "cars";
    }
}

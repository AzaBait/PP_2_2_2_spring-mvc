package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller

public class CarController {
    private CarServiceImpl carServiceImpl;


    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping("/cars")
    public String getAllCars(@RequestParam(defaultValue = "5") int count, Model model) {
        List<Car> cars = carServiceImpl.carsCount(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}




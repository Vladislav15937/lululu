package web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.servise.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.awt.*;
import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCar(Model model, @RequestParam(defaultValue = "5") Integer count) {
        model.addAttribute("spisokmashin",  carService.getCarCount(count));
        return "/cars";
    }
}

package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String listCars(@RequestParam(value = "age", required = false) int i, Model model) {


        model.addAttribute("cars", carService.carsCount(i));
        return "cars";
    }
}
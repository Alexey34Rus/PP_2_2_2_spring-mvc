package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "cars")
    public String printCars(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        CarService carServiceImpl = new CarServiceImpl();
        List<Car> qCars = carServiceImpl.carList(count);
        model.addAttribute("cars", qCars);
        return "cars";
    }
}
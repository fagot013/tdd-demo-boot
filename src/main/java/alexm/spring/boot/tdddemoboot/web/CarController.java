package alexm.spring.boot.tdddemoboot.web;

import alexm.spring.boot.tdddemoboot.domain.Car;
import alexm.spring.boot.tdddemoboot.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AlexM
 */
@RestController
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars/{name}")
    private Car getCar(@PathVariable String name){
        return carService.getCarDetails(name);
    }

}

package alexm.spring.boot.tdddemoboot.service;

import alexm.spring.boot.tdddemoboot.domain.Car;
import alexm.spring.boot.tdddemoboot.domain.CarRepository;
import alexm.spring.boot.tdddemoboot.web.CarNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author AlexM
 */
@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car getCarDetails(String name) {
        Car car = carRepository.findByName(name);
        if (car == null) {
            throw new CarNotFoundException();
        }
        return car;
    }
}

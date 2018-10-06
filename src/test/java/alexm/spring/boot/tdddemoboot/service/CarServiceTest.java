package alexm.spring.boot.tdddemoboot.service;

import alexm.spring.boot.tdddemoboot.domain.Car;
import alexm.spring.boot.tdddemoboot.domain.CarRepository;
import alexm.spring.boot.tdddemoboot.web.CarNotFoundException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * @author AlexM
 */
@RunWith(MockitoJUnitRunner.class)
public class CarServiceTest {


    private CarService carService;

    @Mock
    private CarRepository carRepository;

    @Before
    public void setUp() {
        carService =  new CarService(carRepository);
    }

    @Test
    public void getCarDetails_returnCarInfo() throws Exception {
        given(carRepository.findByName("prius")).willReturn(new Car("prius", "hybrid"));
        Car car = carService.getCarDetails("prius");

        assertThat(car.getName()).isEqualTo("prius");
        assertThat(car.getType()).isEqualTo("hybrid");
    }

    @Test(expected = CarNotFoundException.class)
    public void getCarDetails_whenCarNotFound() throws Exception {
        given(carRepository.findByName("prius")).willReturn(null);
        carService.getCarDetails("prius");

    }

}
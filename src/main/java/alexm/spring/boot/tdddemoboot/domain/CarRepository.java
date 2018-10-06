package alexm.spring.boot.tdddemoboot.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * @author AlexM
 */
public interface CarRepository extends CrudRepository<Car, Long> {
    Car findByName(String name);
}

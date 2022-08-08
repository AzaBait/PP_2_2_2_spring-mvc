package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

import static web.service.CarServiceImpl.cars;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> carsCount(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

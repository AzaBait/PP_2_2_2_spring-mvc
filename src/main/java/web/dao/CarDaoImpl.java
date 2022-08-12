package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    public static List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Ford Raptor", "Blue", 2008));
        cars.add(new Car("Toyota Tundra", "Black", 2010));
        cars.add(new Car("Dodge Ram", "Red", 2015));
        cars.add(new Car("Jeep Wrangler", "Green", 2012));
        cars.add(new Car("Land Rover", "White", 2009));

    }
    @Override
    public List<Car> carsCount(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private CarDao cardao;

    public CarServiceImpl(CarDao cardao) {
        this.cardao = cardao;
    }



    public List<Car> carsCount(Integer count) {

        return cardao.carsCount(count);
    }
}




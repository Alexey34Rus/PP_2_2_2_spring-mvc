package web.service;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarServiceImpl implements CarService{

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList;
        {

            carList = new ArrayList<>();
            carList.add(new Car("Lada", "kalina", 2012));
            carList.add(new Car("Honda", "civic", 2007));
            carList.add(new Car("Jeep", "charok", 1998));
            carList.add(new Car("BMW", "X5", 2010));
            carList.add(new Car("Opel", "Kadet", 2001));
        }
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}

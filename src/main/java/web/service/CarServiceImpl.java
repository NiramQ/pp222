package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList = createCarList();

    private List<Car> createCarList() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Ural", 123, 2000));
        list.add(new Car("Lada", 234, 2001));
        list.add(new Car("Ferrari", 345, 2002));
        list.add(new Car("Mazda", 456, 2003));
        list.add(new Car("Suzuki", 567, 2004));
        return list;
    }

    @Override
    public List<Car> getCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}

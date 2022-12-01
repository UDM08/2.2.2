package web.CarsDAO;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarsDaoImpl {

    public CarsDaoImpl() {
    }

    private static final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("one", "red", 1990));
        cars.add(new Car("two", "green", 1991));
        cars.add(new Car("three", "black", 1992));
        cars.add(new Car("four", "white", 1993));
        cars.add(new Car("five", "blue", 1994));

    }


    public List<Car> carsCount(int age) {
        if (age <= 0 || age > 5) {
            return cars;
        }
        return cars.stream().limit(age).collect(Collectors.toList());
    }

}

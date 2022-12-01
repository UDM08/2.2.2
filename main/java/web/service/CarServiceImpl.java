package web.service;

import web.CarsDAO.CarsDaoImpl;
import web.model.Car;
import java.util.List;


public class CarServiceImpl implements CarService {

    private final CarsDaoImpl carsDao = new CarsDaoImpl();

    @Override
    public List<Car> carsCount(int number) {

        List <Car> cars = carsDao.carsCount(number);

        return cars;
    }
}
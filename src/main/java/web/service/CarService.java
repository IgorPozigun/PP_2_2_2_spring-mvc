package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> listCarsService();
    List<Car> countsCarsIdService(Integer count);


}

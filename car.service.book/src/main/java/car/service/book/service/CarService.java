package car.service.book.service;

import car.service.book.dto.CarDto;

public interface CarService {
    void saveCar(CarDto carDto) throws Exception;
}

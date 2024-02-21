package car.service.book.service;


import com.cars.service.proto.common.dto.CarDto;

public interface CarService {
    void saveCar(CarDto carDto) throws Exception;
}

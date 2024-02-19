package car.service.book.controller;

import car.service.book.dto.CarDto;
import car.service.book.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/car")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }


    @PostMapping("/save")
    public ResponseEntity<String> saveCar(@RequestBody CarDto carDto){
        try {
            carService.saveCar(carDto);
            return ResponseEntity.status(HttpStatus.CREATED).body("Data stored successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to store data.");
        }
    }


}

package car.service.book.mapper;

import car.service.book.dto.CarDto;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

//@Mapper
//public interface CarDtoProtoMapper {
//
//    CarDtoProtoMapper INSTANCE = Mappers.getMapper(CarDtoProtoMapper.class);
//
//    @Mapping(target = "name", source = "name")
//    @Mapping(target = "brand", source = "brand")
//    @Mapping(target = "age", source = "age")
//    Builder carDtoToCarDtoProtoBuilder(CarDto carDto);
//
////    default car.dto.CarDtoProto carDtoToCarDtoProto(CarDto carDto) {
////        return carDtoToCarDtoProtoBuilder(carDto).build();
////    }
////
////    @Mapping(target = "name", source = "name")
////    @Mapping(target = "brand", source = "brand")
////    @Mapping(target = "age", source = "age")
////    CarDto carDtoProtoToCarDto(car.dto.CarDtoProto carDtoProto);
//}

package pl.kacper.hotels_application.remote.rest.api;

import pl.kacper.hotels_application.remote.rest.dto.response.HotelCollectionDto;
import pl.kacper.hotels_application.remote.rest.dto.response.HotelDto;
import pl.kacper.hotels_application.remote.rest.dto.response.RoomDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@RequestMapping(value = "/api/v1/hotels",produces = APPLICATION_JSON_VALUE)
@RestController
public class HotelController {
    @GetMapping
    public ResponseEntity<HotelCollectionDto> getHotel(){
        RoomDto roomDto = new RoomDto(1,"5",BigDecimal.valueOf(30.20));
        HotelDto hotelDto = new HotelDto(1,"MegaHotel",List.of(roomDto));
        HotelCollectionDto hotelCollectionDto = new HotelCollectionDto(List.of(hotelDto));
        return ResponseEntity.ok(hotelCollectionDto);
    }
}

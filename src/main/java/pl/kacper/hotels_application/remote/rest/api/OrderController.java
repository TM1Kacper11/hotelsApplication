package pl.kacper.hotels_application.remote.rest.api;


import pl.kacper.hotels_application.domain.model.OrderStatusType;
import pl.kacper.hotels_application.remote.rest.common.PersonOrderDto;
import pl.kacper.hotels_application.remote.rest.common.HotelOrderDto;
import pl.kacper.hotels_application.remote.rest.dto.response.OrderDto;
import pl.kacper.hotels_application.remote.rest.dto.response.OrderStatusDto;
import pl.kacper.hotels_application.remote.rest.dto.response.TokenDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static pl.kacper.hotels_application.domain.model.OrderStatusType.NEW;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/reservations",produces = APPLICATION_JSON_VALUE)
@RestController
public class OrderController {

    private OrderStatusDto orderStatusDto;

    @PostMapping
    public ResponseEntity<TokenDto> addOrder(@RequestBody OrderDto orderDto){
        return ResponseEntity.ok(null);
    }
    @GetMapping
    public ResponseEntity<OrderStatusDto> getOrders(@RequestParam("status") OrderStatusType orderStatusType, @RequestHeader("Access-Token") String token ){
        HotelOrderDto hotelOrderDto = new HotelOrderDto(3,1,14);
        PersonOrderDto personOrderDto = new PersonOrderDto("Jan Kowalski","123456","Branickiego 34/2",1);
        OrderDto orderDto = new OrderDto(1, NEW, List.of(hotelOrderDto),personOrderDto);
        OrderStatusDto orderStatusDto = new OrderStatusDto(List.of(orderDto));
        return ResponseEntity.ok(orderStatusDto);
    }
    @DeleteMapping("/{order-id}")
    public ResponseEntity<Void> deleteOrder(@RequestHeader("Access-Token") String token, @PathVariable("order-id") Integer orderId ) {
        return ResponseEntity.ok().build();
    }
}

package pl.kacper.hotels_application.remote.rest.dto.response;

import pl.kacper.hotels_application.domain.model.OrderStatusType;
import pl.kacper.hotels_application.remote.rest.common.HotelOrderDto;
import pl.kacper.hotels_application.remote.rest.common.PersonOrderDto;
import pl.kacper.hotels_application.remote.rest.common.HotelOrderDto;

import java.util.List;


public class OrderDto {
    private List<HotelOrderDto> hotels;
    private Integer id;
    private OrderStatusType status;
    private List<HotelOrderDto> rooms;
    private PersonOrderDto person;



    public OrderDto(){

    }


    public OrderDto(int i, OrderStatusType aNew, List<HotelOrderDto> hotelOrderDto, PersonOrderDto personOrderDto) {
    }
}
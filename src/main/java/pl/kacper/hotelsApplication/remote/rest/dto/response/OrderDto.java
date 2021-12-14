package pl.kacper.hotelsApplication.remote.rest.dto.response;

import pl.kacper.hotelsApplication.domain.model.OrderStatusType;
import pl.kacper.hotelsApplication.remote.rest.common.HotelOrderDto;
import pl.kacper.hotelsApplication.remote.rest.common.PersonOrderDto;

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
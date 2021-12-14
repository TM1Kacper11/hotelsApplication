package pl.kacper.hotelsApplication.remote.rest.dto.request;


import pl.kacper.hotelsApplication.domain.model.OrderStatusType;
import pl.kacper.hotelsApplication.remote.rest.common.PersonOrderDto;
import pl.kacper.hotelsApplication.remote.rest.common.HotelOrderDto;

import java.util.List;

public class UpdatedOrderDto {


    private OrderStatusType status;
    private List<HotelOrderDto> hotels;
    private PersonOrderDto person;

    public UpdatedOrderDto(OrderStatusType status, List<HotelOrderDto> hotels, PersonOrderDto person) {
        this.status = status;
        this.hotels = hotels;
        this.person = person;
    }

    public UpdatedOrderDto(){
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<HotelOrderDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelOrderDto> hotels) {
        this.hotels = hotels;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}





package pl.kacper.hotels_application.remote.rest.dto.request;

import pl.kacper.hotels_application.remote.rest.common.PersonOrderDto;
import pl.kacper.hotels_application.remote.rest.common.HotelOrderDto;

import java.util.List;

public class AddOrderDto {

    private List<HotelOrderDto> hotels;
    private PersonOrderDto person;

    public AddOrderDto(){
    }

    public AddOrderDto(List<HotelOrderDto> hotels, PersonOrderDto person) {
        this.hotels = hotels;
        this.person = person;
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

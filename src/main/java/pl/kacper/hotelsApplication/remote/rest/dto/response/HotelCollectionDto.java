package pl.kacper.hotelsApplication.remote.rest.dto.response;

import java.util.List;

public class HotelCollectionDto {
    private List<HotelDto> hotels;

    public HotelCollectionDto() {
    }

    public HotelCollectionDto(List<HotelDto> hotels) {
        this.hotels = hotels;
    }

    public List<HotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDto> hotels) {
        this.hotels = hotels;
    }
}
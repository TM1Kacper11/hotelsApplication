package pl.kacper.hotelsApplication.remote.rest.dto.request;

import java.util.List;

public class AddHotelDto {

    private Object beds;
    private String name;

    public AddHotelDto(Object beds, String name) {
        this.beds = beds;
        this.name = name;
    }

    public AddHotelDto() {


    }

    public Object getBeds() {
        return beds;
    }

    public void setBeds(Object beds) {
        this.beds = beds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

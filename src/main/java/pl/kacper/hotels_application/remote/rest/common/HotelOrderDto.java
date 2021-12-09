package pl.kacper.hotels_application.remote.rest.common;

public class HotelOrderDto {

    private Integer id;
    private Integer beds;
    private Integer roomId;
    private Integer count;

    public HotelOrderDto(int i, int i1, int i2){
    }

    public HotelOrderDto(Integer id, Integer beds, Integer roomId, Integer count) {

        this.id = id;
        this.beds = beds;
        this.roomId = roomId;
        this.count = count;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}

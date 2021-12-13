package pl.kacper.hotels_application.data.entity.room;

import pl.kacper.hotels_application.data.entity.hotel.HotelEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "rooms")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "hotel_id")
    private Integer hotelId;

    @ManyToOne
    @JoinColumn(name = "hotel_id", insertable = false,updatable = false)
    private HotelEntity hotel;

    public RoomEntity(Integer id, BigDecimal price, Integer hotelId, HotelEntity hotel) {
        this.id = id;
        this.price = price;
        this.hotelId = hotelId;
        this.hotel = hotel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public HotelEntity getHotel() {
        return hotel;
    }

    public void setHotel(HotelEntity hotel) {
        this.hotel = hotel;
    }
}

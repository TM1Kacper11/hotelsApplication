package pl.kacper.hotelsApplication.data.entity.room;

import pl.kacper.hotelsApplication.data.entity.hotel.HotelEntity;

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


}

package pl.kacper.hotels_application.data.entity.bed;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name= "beds")
public class BedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "bed_type")
    private Integer bedType;

    @Column(name = "price_base")
    private BigDecimal priceBase;

    @Column(name = "hotel_id")
    private Integer hotelId;

    public BedEntity(Integer id, Integer bedType, BigDecimal priceBase, Integer hotelId) {
        this.id = id;
        this.bedType = bedType;
        this.priceBase = priceBase;
        this.hotelId = hotelId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getBedType() {
        return bedType;
    }

    public BigDecimal getPriceBase() {
        return priceBase;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBedType(Integer bedType) {
        this.bedType = bedType;
    }

    public void setPriceBase(BigDecimal priceBase) {
        this.priceBase = priceBase;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }
}

package pl.kacper.hotelsApplication.data.entity.bed;

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


}

package pl.kacper.hotels_application.data.entity.hotel;


import javax.persistence.*;

@Entity
@Table(name= "hotels")


public class HotelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;


}

package pl.kacper.hotelsApplication.data.entity.order;

import javax.persistence.*;
import java.util.Date;

public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_phone")
    private String clientPhone;

    @Column(name = "client_address")
    private String clientAddress;

    @Column(name = "client_mail")
    private String clientMail;

    @Column(name = "floor")
    private Integer floor;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_At")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_At")
    private Date updateAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "expected_At")
    private Date expectedAt;

    @Column(name = "token")
    private String token;

}

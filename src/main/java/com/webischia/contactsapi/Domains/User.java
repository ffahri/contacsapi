package com.webischia.contactsapi.Domains;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

   // private String password;

    private String name;

    private String surname;

    private String email;

  //  private int phone; //todo çok ileride sms entegrasyonu yapabilirim

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "access_id", nullable = false)
    private AccessLevel access_id;


    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate = new Date();
}

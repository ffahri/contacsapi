package com.webischia.contacsapi.Domains;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String surname;

    private int phone;

    private int phone2;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;


    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate = new Date();
}
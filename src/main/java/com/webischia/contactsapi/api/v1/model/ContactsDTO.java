package com.webischia.contactsapi.api.v1.model;

import lombok.Data;

import java.util.Date;

@Data
public class ContactsDTO {

    private int id;

    private String name;

    private String surname;

    private int phone;

    private int phone2;

    private Date creationDate = new Date();

}

package com.webischia.contactsapi.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ContactsListDTO {

    List<ContactsDTO> contacts;
}

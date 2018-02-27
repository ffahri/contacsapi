package com.webischia.contactsapi.Services;

import com.webischia.contactsapi.api.v1.model.ContactsDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactsService {

    List<ContactsDTO> getAllContactsByUserId(int id);
    ContactsDTO getContactByContactId(int id);

}

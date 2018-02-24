package com.webischia.contacsapi.Bootstrap;

import com.webischia.contacsapi.Repositories.ContactsRepository;
import com.webischia.contacsapi.Repositories.UserRepository;

public class ContactsBoot {

    private final UserRepository userRepository;
    private final ContactsRepository contactsRepository;

    public ContactsBoot(UserRepository userRepository, ContactsRepository contactsRepository) {
        this.userRepository = userRepository;
        this.contactsRepository = contactsRepository;
    }


}

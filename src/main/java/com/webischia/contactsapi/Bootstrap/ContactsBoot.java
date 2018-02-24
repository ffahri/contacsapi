package com.webischia.contactsapi.Bootstrap;

import com.webischia.contactsapi.Repositories.ContactsRepository;
import com.webischia.contactsapi.Repositories.UserRepository;

public class ContactsBoot {

    private final UserRepository userRepository;
    private final ContactsRepository contactsRepository;

    public ContactsBoot(UserRepository userRepository, ContactsRepository contactsRepository) {
        this.userRepository = userRepository;
        this.contactsRepository = contactsRepository;
    }

    public void run()
    {

    }

}

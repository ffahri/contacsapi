package com.webischia.contactsapi.Bootstrap;

import com.webischia.contactsapi.Domains.Contacts;
import com.webischia.contactsapi.Domains.User;
import com.webischia.contactsapi.Repositories.ContactsRepository;
import com.webischia.contactsapi.Repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ContactsBoot implements CommandLineRunner {

    private final UserRepository userRepository;
    private final ContactsRepository contactsRepository;

    public ContactsBoot(UserRepository userRepository, ContactsRepository contactsRepository) {
        this.userRepository = userRepository;
        this.contactsRepository = contactsRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Contacts newContact = new Contacts();
        newContact.setName("Linus");
        newContact.setSurname("Torvalds");
        newContact.setPhone(1);
        User rms = userRepository.findById(1).get();
        newContact.setUser(rms);
        contactsRepository.save(newContact);

    }




}

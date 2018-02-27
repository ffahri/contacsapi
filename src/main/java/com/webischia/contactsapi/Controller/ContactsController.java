package com.webischia.contactsapi.Controller;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.AccessDeniedException;

@RestController
@RequestMapping({"/api/v1/contacts/","/api/v1/contacts"})
public class ContactsController {

    private final ContactsService contactsService;

    public ContactsController(ContactsService contactsService) {
        this.contactsService = contactsService;
    }

    //@PreAuthorize("hasAuthority('Client') or hasAuthority('Employee')")
    @GetMapping("/user/{name}")
    public ResponseEntity<ContactsListDTO> getUserAllTicketsByUserName(@PathVariable String name) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userWhichRequest = authentication.getName();
        if (name.equals(userWhichRequest)) {
            return new ResponseEntity<ContactsListDTO>(new ContactsListDTO(contactsService.getAllTicketsByUsername(name)), HttpStatus.OK);
        }
        else if (userRepository.findByUsername(userWhichRequest).get().getAccessLevel().getDescription().equals("Employee"))
        {
            return new ResponseEntity<ContactsListDTO>(new ContactsListDTO(contactsService.getAllTicketsByUsername(name)), HttpStatus.OK);

        }
        else
            throw new AccessDeniedException("Wrong User || Hatalı Kullanıcı");
    }



}

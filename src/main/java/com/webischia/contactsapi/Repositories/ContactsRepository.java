package com.webischia.contactsapi.Repositories;

import com.webischia.contactsapi.Domains.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepository extends JpaRepository<Contacts,Integer>{
}

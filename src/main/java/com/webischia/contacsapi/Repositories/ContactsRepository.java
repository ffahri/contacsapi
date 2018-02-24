package com.webischia.contacsapi.Repositories;

import com.webischia.contacsapi.Domains.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepository extends JpaRepository<Contacts,Integer>{
}

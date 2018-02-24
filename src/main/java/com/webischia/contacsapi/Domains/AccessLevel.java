package com.webischia.contacsapi.Domains;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class AccessLevel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private short id; //short geçerli projede ~3 tane rol olması planlanıyor. Bellekten yer kazanalım (int vs short ? )

    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate = new Date();
}

package com.sagroup.schoolservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data @AllArgsConstructor @NoArgsConstructor
public class School {

    @Id
    private String id;

    private String name;

    private Address address;

    private Contact contact;

}

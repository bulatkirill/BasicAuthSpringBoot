package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private Set<Pet> pets;
}

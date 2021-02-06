package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Pet {

    private String firstName;
    private String lastName;
    private String nickName;
    private LocalDate birthDate;
    private String family;
}

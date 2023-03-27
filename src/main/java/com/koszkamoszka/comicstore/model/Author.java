package com.koszkamoszka.comicstore.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Author {
    public enum Role {
        WRITER, ARTIST
    }

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Role role;
}

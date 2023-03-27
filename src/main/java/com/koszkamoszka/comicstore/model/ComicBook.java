package com.koszkamoszka.comicstore.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ComicBook {
    private String title;
    private LocalDate publishedDate;
    private List<Author> authors;
    private String genre;
}

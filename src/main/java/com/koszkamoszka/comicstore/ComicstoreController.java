package com.koszkamoszka.comicstore;

import com.koszkamoszka.comicstore.model.ComicBook;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/comicbook")
public class ComicstoreController {
    private final List<ComicBook> comicBooks = new ArrayList<>();

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createComicBook(@RequestBody ComicBook comicBook) {
        comicBooks.add(comicBook);
        return ResponseEntity.ok().build();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ComicBook> getComicBooks() {
        return comicBooks;
    }

    @DeleteMapping("/{title}")
    public ResponseEntity<?> removeComicBook(@PathVariable String title) {
        for (ComicBook comicBook : comicBooks) {
            if (comicBook.getTitle().equals(title)) {
                comicBooks.remove(comicBook);
                break;
            }
        }
        return ResponseEntity.ok().build();
    }
}

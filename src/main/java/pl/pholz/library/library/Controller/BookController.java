package pl.pholz.library.library.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pholz.library.library.Entity.Book;
import pl.pholz.library.library.Repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/hi")
    public String Hi(){
        return "Hi";
    }

    @RequestMapping("/books")
    public List<Book> getAllBooks(){
        List<Book> listOfBooks = new ArrayList<>();
                bookRepository.findAll()
                .forEach(listOfBooks::add);
                return listOfBooks;
    }

    @RequestMapping("/books/{id}")
    public Book getBook(@PathVariable Long id){
        return bookRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books/add")
    public void addBook(@RequestBody Book book){
        bookRepository.save(book);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/books/delete/{id}")
    public void deleteBook(@PathVariable Long id){
        bookRepository.delete(id);
    }

   }

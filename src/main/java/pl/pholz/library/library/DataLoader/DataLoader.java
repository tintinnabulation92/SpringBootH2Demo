package pl.pholz.library.library.DataLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.pholz.library.library.Entity.Book;
import pl.pholz.library.library.Repository.BookRepository;

@Component
public class DataLoader {

    private BookRepository bookRepository;

    @Autowired
    public DataLoader(BookRepository bookRepository){
        this.bookRepository = bookRepository;
        LoadBooks();
    }

    private void LoadBooks(){
        bookRepository.save(new Book("Book1", "Autor"));
        bookRepository.save(new Book("Book2", "Autor"));
        bookRepository.save(new Book("Book3", "Autor"));
        bookRepository.save(new Book("Book4", "Autor"));
        bookRepository.save(new Book("Book5", "Autor"));
        bookRepository.save(new Book("Book6", "Autor"));
        bookRepository.save(new Book("Book7", "Autor"));
        bookRepository.save(new Book("Book8", "Autor"));
        bookRepository.save(new Book("Book9", "Autor"));
    }
}

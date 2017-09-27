package pl.pholz.library.library.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.pholz.library.library.Entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}

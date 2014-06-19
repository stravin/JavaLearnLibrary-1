package ru.grey.domain.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.grey.domain.model.Author;
import ru.grey.domain.model.Book;
import ru.grey.domain.service.AuthorService;
import ru.grey.domain.service.BookService;

import java.util.List;

/**
 * Created by stravin on 18.06.2014.
 */
public class Start {
    protected static ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});

    public static void main(String[] args) {

        AuthorService authorService = (AuthorService) classPathXmlApplicationContext.getBean("authorServiceImpl");
//        Author author = authorService.findById(Author.class, 1L);
//        System.out.println(author);
        List<Author> authors = authorService.findAll();
        for (Author a : authors) {
            System.out.println(a);
        }

        BookService bookService = (BookService) classPathXmlApplicationContext.getBean("bookServiceImpl");
//        Book book = bookService.findById(Book.class, 3L);
//        System.out.println(book);

        List<Book> books = bookService.findAll();
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

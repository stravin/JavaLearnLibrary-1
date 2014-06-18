package ru.grey.domain.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.grey.domain.model.Author;
import ru.grey.domain.service.AuthorService;

/**
 * Created by stravin on 18.06.2014.
 */
public class Start {
    protected static ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});

    public static void main(String[] args) {

        AuthorService authorService = (AuthorService) classPathXmlApplicationContext.getBean("authorServiceImpl");
        Author author = authorService.findById(Author.class, 1L);
        System.out.println(author);
    }
}

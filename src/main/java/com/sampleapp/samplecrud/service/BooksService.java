package com.sampleapp.samplecrud.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sampleapp.samplecrud.model.Books;
import com.sampleapp.samplecrud.repository.BooksRepository;
//defining the business logic
@Service
public class BooksService
{
    @Autowired
    BooksRepository booksRepository;

    public List<Books> getAllBooks()
    {
        List<Books> books = new ArrayList<Books>();
        booksRepository.findAll().forEach(books1 -> books.add(books1));
        return books;
    }
    //get record
    public Books getBooksById(int id)
    {

        return booksRepository.findById(id).get();
    }
    //saving a specific record
    public void saveOrUpdate(Books books)
    {
        booksRepository.save(books);
    }
    //deleting a specific record
    public void delete(int id)
    {
        booksRepository.deleteById(id);
    }
    //update
    public void update(Books books, int bookid)
    {
        booksRepository.save(books);
    }
}
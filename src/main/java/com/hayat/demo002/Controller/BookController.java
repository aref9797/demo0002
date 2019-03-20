package com.hayat.demo002.Controller;


import com.hayat.demo002.Model.book;
import com.hayat.demo002.Service.Interface.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private bookService bos;

    @PostMapping("/book")
    public book add(@RequestBody book book)
    {
        return bos.save(book);
    }
    @GetMapping("/booo")
    public Iterable<book> getall()
    {
        return bos.findAll();
    }

}

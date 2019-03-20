package com.hayat.demo002.Service.Interface;

import com.hayat.demo002.Model.book;
import org.springframework.data.repository.CrudRepository;

public interface bookService extends CrudRepository<book,Integer> {
}

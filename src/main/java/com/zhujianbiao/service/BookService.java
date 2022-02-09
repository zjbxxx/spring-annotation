package com.zhujianbiao.service;

import com.zhujianbiao.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Qualifier("bookDao")
    @Autowired
    private BookDao bookDao;


    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}

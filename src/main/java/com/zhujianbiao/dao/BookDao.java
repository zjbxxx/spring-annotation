package com.zhujianbiao.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
    private Integer bookPage = 1;

    public Integer getBookPage() {
        return bookPage;
    }

    public void setBookPage(Integer bookPage) {
        this.bookPage = bookPage;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "bookPage=" + bookPage +
                '}';
    }
}

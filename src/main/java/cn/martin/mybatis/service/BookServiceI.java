package cn.martin.mybatis.service;

import cn.martin.mybatis.model.Book;

import java.util.List;

/**
 * Created by martin on 2015-01-20.
 */
public interface BookServiceI {

    public Book getBookById(String id);

    public int deleteBookById(String id);

    public List<Book> getAll();
}

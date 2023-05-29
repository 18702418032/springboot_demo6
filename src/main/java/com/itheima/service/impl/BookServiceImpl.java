package com.itheima.service.impl;

/**
 * ClassName: BookServiceImpl
 * Package: com.itheima.service.impl
 * Description:
 *
 * @Author wanyutang
 * @Create 2023/5/8 18:24
 * @Version 1.0
 */
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    public List<Book> getByName(String name){return bookDao.getByName(name);}

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
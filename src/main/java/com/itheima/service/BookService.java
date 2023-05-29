package com.itheima.service;

/**
 * ClassName: BookService
 * Package: com.itheima.service
 * Description:
 *
 * @Author wanyutang
 * @Create 2023/5/8 18:26
 * @Version 1.0
 */
import com.itheima.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Book getById(Integer id);


    /**
     * 按name查询
     * @param name
     * @return
     */
    public List<Book> getByName(String name);

    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll();
}


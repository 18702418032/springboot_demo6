package com.itheima.dao;

/**
 * ClassName: BookDao
 * Package: com.itheima.dao
 * Description:
 *
 * @Author wanyutang
 * @Create 2023/5/8 18:23
 * @Version 1.0
 */
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookDao {

    //    @Insert("insert into tbl_book values(null,#{type},#{name},#{description})")
    @Insert("insert into tbl_book (type,name,description) values(#{type},#{name},#{description})")
    public int save(Book book);

    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public int update(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    public int delete(Integer id);

    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from tbl_book where name like #{name} ")
    public List<Book> getByName(String name);

    @Select("select * from tbl_book")
    public List<Book> getAll();
}


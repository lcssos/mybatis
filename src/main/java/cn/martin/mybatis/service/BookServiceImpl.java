package cn.martin.mybatis.service;

import cn.martin.mybatis.dao.BookMapper;
import cn.martin.mybatis.model.Book;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by martin on 2015-01-20.
 */

@Service("bookService")
public class BookServiceImpl implements BookServiceI {

	@Resource(name = "bookMapper")
	private BookMapper bookMapper;

	@Override
	public Book getBookById(String bid) {
		return bookMapper.selectByPrimaryKey(bid);
	}

	@Override
	public int deleteBookById(String id) {
		return bookMapper.deleteByPrimaryKey(id);
	}

	public List<Book> getAll(){
		return bookMapper.getAll();
	}
}

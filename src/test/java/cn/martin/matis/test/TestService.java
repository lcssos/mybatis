package cn.martin.matis.test;

import cn.martin.mybatis.model.Book;
import cn.martin.mybatis.service.BookServiceI;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by martin on 2015-01-20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext-*.xml"})
public class TestService {
	
	private static Logger logger = Logger.getLogger(TestService.class);

    @Resource(name = "bookService")
    private BookServiceI bookService;

    @Test
    public void BookTest01(){
//        System.out.println();
        Book book = bookService.getBookById("4/o%*(/-llo,m*k/n+)/,+nol(p%o%-%)(,*k+()&o%%(+l/n-.lpo)n))(/p*n+");
        logger.info(JSON.toJSONStringWithDateFormat(book, "yyyy-MM-dd HH:mm:ss"));
    }

    @Test
    public void BookTest02(){
        bookService.deleteBookById("xxx");
    }

    @Test
    public void BookTest03(){
        List<Book> list = bookService.getAll();
        logger.info(JSON.toJSONString(list));
    }

}

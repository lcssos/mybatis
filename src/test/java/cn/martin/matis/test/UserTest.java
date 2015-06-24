package cn.martin.matis.test;

import cn.martin.mybatis.model.User;
import cn.martin.mybatis.service.IUserService;
import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by martin on 2015-01-21.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext-*.xml"})
public class UserTest {


    private static Logger logger = Logger.getLogger(TestService.class);

    @Resource
    private IUserService userService;

    @Test
    public void Test01(){
        List<User> list = userService.getAll();
        logger.info(JSON.toJSONString(list));
    }

    @Test
    public void Test02(){
        List<User> list = userService.getAll2();
        logger.info(JSON.toJSONString(list));
    }

    @Test
    public void Test03(){
        List<User> list = userService.getAll3();
        logger.info(JSON.toJSONString(list));
    }
}

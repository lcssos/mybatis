package cn.martin.mybatis.service;

import cn.martin.mybatis.dao.UserMapper;
import cn.martin.mybatis.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by martin on 2015-01-21.
 */

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public List<User> getAll2() {
        return userMapper.getAll2();
    }


    @Override
    public List<User> getAll3() {
        return userMapper.getAll3();
    }
}

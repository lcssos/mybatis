package cn.martin.mybatis.service;

import cn.martin.mybatis.model.User;

import java.util.List;

/**
 * Created by martin on 2015-01-21.
 */
public interface IUserService {
    public List<User> getAll();
    public List<User> getAll2();
    public List<User> getAll3();
}

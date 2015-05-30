package com.joker.bbiz.remote.impl;

import com.joker.bbiz.dao.UserDao;
import com.joker.bremote.dto.User;
import com.joker.bremote.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shichao.liao on 15/5/30.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public User loadUser(int id) {
        return userDao.loadUser(id);
    }
}

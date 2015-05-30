package com.joker.bbiz.dao;

import com.joker.bremote.dto.User;

/**
 * Created by shichao.liao on 15/5/22.
 */
public interface UserDao {

    public int addUser(User user);
    public User loadUser(int id);
}

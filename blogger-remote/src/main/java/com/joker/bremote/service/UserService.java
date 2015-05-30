package com.joker.bremote.service;

import com.joker.bremote.dto.User;

/**
 * Created by shichao.liao on 15/5/30.
 */
public interface UserService {
    public int addUser(User user);
    public User loadUser(int id);
}

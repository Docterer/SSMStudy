package com.test.dao;

import com.test.model.User;

import java.util.List;

public interface UserDao {

    public List<User> getAllUser();

    public void insertUser(User user);
}

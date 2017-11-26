package com.mybatisdemo.dao;

import com.mybatisdemo.models.User;

import java.util.List;

public interface IUser {
    List<User> getUserList();

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(int userId);

    User getUser(int id);
}

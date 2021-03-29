package com.java.kontrolnaya.services;

import com.java.kontrolnaya.models.User;

import java.util.List;

public interface IUserService {

    void create(User User);

    List<User> readAll();

    User read(int id);

    boolean update(User User, int id);

    boolean delete(int id);
}
package com.yummy.bakery.service;


import com.yummy.bakery.model.entity.User;

import java.util.List;

public interface UserService {

    User findByUsername(String name);

    User findByEmail(String email);

    User findOne(long id);

    void delete(long id);

    List<User> findAll();

}
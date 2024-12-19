package com.shyloostyle.springmvc.service;

import com.shyloostyle.springmvc.model.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> getUsers();
    User getUserById(Integer id);
    Boolean deleteUserById(User user, Integer id);
}

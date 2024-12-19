package com.shyloostyle.springmvc.service.impl;

import com.shyloostyle.springmvc.model.User;
import com.shyloostyle.springmvc.repository.UserRepository;
import com.shyloostyle.springmvc.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Boolean save(User user) {
        userRepository.save(user);
        return false;
    }

    @Override
    public List<User> getUser(User user) {
        return userRepository.findAll();
    }
}

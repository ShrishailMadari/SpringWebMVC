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
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean deleteUserById(User user, Integer id) {
        return null;
    }
}

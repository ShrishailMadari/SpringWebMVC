package com.shyloostyle.springmvc.service;

import com.shyloostyle.springmvc.model.User;
import com.shyloostyle.springmvc.repository.UserRepository;

import java.util.List;

public interface UserService {
    Boolean save(User user);
    List<User> getUser(User user);
}

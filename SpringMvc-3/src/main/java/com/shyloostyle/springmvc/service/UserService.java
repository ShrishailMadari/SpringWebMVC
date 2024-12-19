package com.shyloostyle.springmvc.service;

import com.shyloostyle.springmvc.model.User;
import com.shyloostyle.springmvc.repository.UserRepository;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> getUsers();
    User getUserById(Integer id);
    Boolean deleteUserById(User user, Integer id);
}

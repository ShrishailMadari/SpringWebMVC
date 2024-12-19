package com.shyloostyle.springmvc.controller;

import com.shyloostyle.springmvc.model.User;
import com.shyloostyle.springmvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/form")
    public String loadForm(Model model){
        return "index";
    }

    @GetMapping("/users")
    public String getUsers(Model model){
        List<User> users = userService.getUsers();
        model.addAttribute("key",users);
        return "index";
    }

    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable Integer id, Model model){
        User userById = userService.getUserById(id);
        model.addAttribute("key",userById);
        return "index";
    }
}

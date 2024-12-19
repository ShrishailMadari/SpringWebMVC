package com.shyloostyle.springmvc.controller;

import com.shyloostyle.springmvc.model.User;
import com.shyloostyle.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/")
    public String loadForm(Model model){
        User user = new User();
        model.addAttribute("key",user);
        return "index";
    }
    @PostMapping("/user")
    public String saveUser(Model model) {
        // Save the user object (you can add logic to save to the database here)
        return "index";  // Redirect to load the form again
    }

    @GetMapping("/AllUsers")
    public String getUsers(Model model){
        List<User> users = userService.getUsers();
        model.addAttribute("user",users);
        return "index";
    }

    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable Integer id, Model model){
        User userById = userService.getUserById(id);
        model.addAttribute("user",userById);
        return "index";
    }
}

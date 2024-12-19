package com.shyloostyle.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/products")
    public String getProduct(Model model){
        String[] string = {"shri","alice","david","otis"};
        model.addAttribute("key",string.length+": "+ Arrays.toString(string));
        return "index";
    }
}

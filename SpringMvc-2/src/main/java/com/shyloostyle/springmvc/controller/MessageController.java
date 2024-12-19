package com.shyloostyle.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/message") //class level url
// to overcome the ambiguity between methods those have same url's
public class MessageController {
    /*Two types of Methods
    * 1) */
    @GetMapping("/greet")
    public String getMessage(Model model){
        String string = "Om Namho Narayanay.....🤞🤞🤞";
        model.addAttribute("msg1", string);
        return "index";
    }

    @GetMapping("/welcome")
    public ModelAndView getMessage(){
        ModelAndView modelAndView = new ModelAndView();
        String string = "Om Namho Narayanay.....🤞🤞🤞❤️";
        modelAndView.addObject("msg1", string);
        modelAndView.setViewName("index");
        return modelAndView;
    }

}

package com.shyloostyle.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

// to represent this class as controller
//using single index page multiple methods are called to execute the multiple features
//message is same but the values are different
//this is multi action controller, similar to this there will be multiple
//controllers with multiple methods
@Controller
public class messageController {
    @GetMapping("/welcome")
    public ModelAndView getWelcome(){

        ModelAndView modelAndView = new ModelAndView();
        //setting the response data in key value format
        modelAndView.addObject("msg1", "WellCome Shrishail For First WebMvc");
        modelAndView.addObject("msg2","heloooo");
        //this is used to view the page: in which page it has to view
        //that is in Index.html page it has to be viewed
        modelAndView.setViewName("Index");
//        the file name should be matching with setView Name
        return modelAndView;

    }
    @GetMapping("/greet")
    public ModelAndView getGreetMessage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("value","Good Morning");
        modelAndView.setViewName("Index");
        return modelAndView;
    }
}

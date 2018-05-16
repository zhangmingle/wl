package com.mlzhang.wl.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping(value = { "/", "/login" })
    public ModelAndView login() {
        System.out.println(1111);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @GetMapping(value = "/home")
    public String home() {
        System.out.println(22222222);
        return "home";
    }

    @GetMapping(value = "/wel")
    public String wel() {
        System.out.println(3333);
        return "welcome";
    }
}

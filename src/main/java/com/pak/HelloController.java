package com.pak;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping("/msg")
    public ModelAndView getMsg(@RequestParam String name) {

        String msgTxt = name + ", Good Evening";

        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", msgTxt);

        mav.setViewName("index");

        return mav;
    }
}

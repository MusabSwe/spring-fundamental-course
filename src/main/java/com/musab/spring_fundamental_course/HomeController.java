package com.musab.spring_fundamental_course;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        String viewName = getViewName();
        // System.out.println(viewName);
        return viewName;
    }

    private String getViewName() {
        return "index.html";
    }
}

package net.codejava.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Spring Web MVC Security Java Config Demo Project
 * Primary controller of the application.
 *
 * @author www.codejava.net
 */
@Controller
public class MainController {

    @GetMapping("/")
    public ModelAndView visitHome() {
        return new ModelAndView("index");
    }

    @GetMapping("/admin")
    public ModelAndView visitAdmin() {
        ModelAndView model = new ModelAndView("admin");
        model.addObject("title", "Admministrator Control Panel");
        model.addObject("message", "This page demonstrates how to use Spring security.");
        return model;
    }
}

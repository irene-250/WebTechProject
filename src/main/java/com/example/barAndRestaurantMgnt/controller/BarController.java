package com.example.barAndRestaurantMgnt.controller;

import com.example.barAndRestaurantMgnt.model.Bar;
import com.example.barAndRestaurantMgnt.service.implementation.BarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class BarController {

        @Autowired
    BarServiceImpl barService;


    @GetMapping("/")

    public String landingPage(){

        return "landingPage";

    }
    @GetMapping(value = "/sign-up")
    public String loadSignUpPage(Model model) {
        Bar user = new Bar();
        model.addAttribute("user", user);
        return "sign-up";
    }
    @GetMapping("/registration")

    public String registerProductPage(Model model){
        Bar barr= new Bar();
        model.addAttribute("bar", barr);

        return "registrationPage";
    }

    @PostMapping("/register")
    public String registerProductInDb(@ModelAttribute("bar") Bar theBar){

        Bar savedProduct= barService.registerProduct(theBar);
        if (savedProduct != null){

            return "redirect:/";

        }else {
            return "registrationPage";
        }
    }
    @GetMapping("/update")
    public  String updateProduct(){


        return"updatePage";
    }


}

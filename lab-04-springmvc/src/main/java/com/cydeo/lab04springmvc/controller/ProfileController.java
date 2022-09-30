package com.cydeo.lab04springmvc.controller;

import com.cydeo.lab04springmvc.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class ProfileController {

    @RequestMapping("/profile")
    public String retrieveProfile(Model model){

        Profile profile = new Profile();
        profile.setName("Mike");
        profile.setSurname("Smith");
        profile.setUserName("007");
        profile.setEmail("mikesmith007@gmail.com");
        profile.setPhoneNumber("1562576548");
        profile.setCreatedDate(LocalDateTime.now());

        model.addAttribute("profile",profile);
        return "profile/profile-info";
    }
}

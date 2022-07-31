package com.example.aboutMe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
  // ホーム画面の画面名(resources/templates/home.html)
  private static final String HOME_TEMPLATE = "home";

  @RequestMapping("/")
  public String home() {
    return HOME_TEMPLATE;
  }
}

package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/home")
    public String loginSubmit(){
        return "/pages/landing_page";
    }


}

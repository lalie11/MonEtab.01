package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rapport")
public class RapportController {
    @GetMapping("/operations")
    public String rapport(){
        return "/pages/rapport/index";
    }
}

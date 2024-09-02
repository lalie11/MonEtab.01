package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @RequestMapping("")
    public String professeur(){
        return "/pages/professeur/professeur";
    }
    @RequestMapping("ajouter")
    public String ajouter(){
        return "/pages/professeur/ajouter_professeur";
    }

    @RequestMapping("modifier")
    public String modifier(){
        return "/pages/professeur/modifier_professeur";
    }


}

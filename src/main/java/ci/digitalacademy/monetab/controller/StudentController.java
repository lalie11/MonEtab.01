package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {


    @GetMapping("")
    public String eleve(){
        return "/pages/eleve/eleve";
    }
    @GetMapping("ajouter")
    public String ajouter(){
        return "/pages/eleve/ajouter_eleve";
    }

    @GetMapping("modifier")
    public String modifier(){
        return "/pages/eleve/modifier_eleve";
    }

}
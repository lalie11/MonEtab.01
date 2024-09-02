package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("")
    public String utilisateur(){
        return "/pages/utilisateur/utilisateur";
    }
    @RequestMapping("/ajouter")
    public String ajouter(){
        return "/pages/utilisateur/ajouter_utilisateur";
    }

    @RequestMapping("modifier")
    public String modifier(){
        return "/pages/utilisateur/modifier_utilisateur";
    }


}

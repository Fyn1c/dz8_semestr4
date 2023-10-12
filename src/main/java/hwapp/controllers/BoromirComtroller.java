package hwapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoromirComtroller {

    @GetMapping("/odns")
    public String odnsPage(){
        return "boromir/odns";
    }

    @GetMapping("/mwa")
    public String mwaPage(){
        return "boromir/mwa";
    }
}

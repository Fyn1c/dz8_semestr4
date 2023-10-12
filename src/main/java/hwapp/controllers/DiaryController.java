package hwapp.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DiaryController {

    @GetMapping("/diary")
    public String diaryPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            @RequestParam(value = "age", required = false) String age,
                            Model model){
        if(name != null && surname != null && age != null){
            model.addAttribute("message", "Hello " + name + " " + surname + " with age " + age + ", my name is Tom Riddle");
        }else if(name != null && surname != null){
            model.addAttribute("message", "Hello " + name + " " + surname + ", my name is Tom Riddle");
        }else if(name != null){
            model.addAttribute("message", "Hello " + name + ", my name is Tom Riddle");
        }
        return "diary/helloTomRiddle";
    }
}

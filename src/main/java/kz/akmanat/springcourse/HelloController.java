package kz.akmanat.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/1")
    public String sayHello(){
        return "1";
    }
}

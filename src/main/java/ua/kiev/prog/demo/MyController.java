package ua.kiev.prog.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @GetMapping()
    public String onIndex() {
        return "index";
    }

    @PostMapping()
    public String onIndexs() {
        return "index";
    }

}

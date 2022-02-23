package spring.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello bae";
    }

    // http://localhost:8080/todolist/welcome
    @GetMapping("welcome")
    public String welcome(Model model) {
        model.addAttribute("user", "Samuel");
        log.info("model = {}", model);

        // prefix + name + suffix
        // /WEB_INF/view/welcome.jsp
        return "welcome";
    }

    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage() Called");
        return "welcome to this demo application";
    }
}

///Users/samuellamina/IdeaProjects/todolist
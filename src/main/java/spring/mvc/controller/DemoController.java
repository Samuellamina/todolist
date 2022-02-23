package spring.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.mvc.service.DemoService;

@Slf4j
@Controller
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello bae";
    }

    // http://localhost:8080/todolist/welcome
    @GetMapping("welcome")
    public String welcome(Model model) {
        model.addAttribute("helloMessage", demoService.getHelloMessage("Samuel Lamina"));
        log.info("model = {}", model);

        // prefix + name + suffix
        // /WEB_INF/view/welcome.jsp
        return "welcome";
    }

    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage() Called");
        return demoService.getWelcomeMessage();
    }
}

///Users/samuellamina/IdeaProjects/todolist
package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import spring.mvc.model.ToDoData;
import spring.mvc.util.Mappings;
import spring.mvc.util.ViewNames;

@Controller
public class ToDoItemController {

    // model attributes
    @ModelAttribute
    public ToDoData toDoData() {
        return new ToDoData();
    }

    // handler method
    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }
}

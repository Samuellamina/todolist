package spring.mvc.service;

import org.springframework.stereotype.Service;
import spring.mvc.model.ToDoData;
import spring.mvc.model.ToDoItem;

@Service
public class ToDoItemServiceImpl implements ToDoItemService {

    private final ToDoData toDoData = new ToDoData();


    @Override
    public void addItem(ToDoItem toDoItem) {
        toDoData.addItem(toDoItem);
    }

    @Override
    public void removeItem(int id) {
        toDoData.removeItem(id);
    }

    @Override
    public ToDoItem getItem(int id) {
        return toDoData.getItem(id);
    }

    @Override
    public void updateItem(ToDoItem toDoItem) {
        toDoData.updateItem(toDoItem);
    }

    @Override
    public ToDoData getData() {
        return toDoData;
    }
}

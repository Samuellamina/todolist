package spring.mvc.service;

import spring.mvc.model.ToDoData;
import spring.mvc.model.ToDoItem;

public interface ToDoItemService {
    void addItem(ToDoItem toDoItem);

    void removeItem(int id);

    ToDoItem getItem(int id);

    void updateItem(ToDoItem toDoItem);

    ToDoData getData();
}
 
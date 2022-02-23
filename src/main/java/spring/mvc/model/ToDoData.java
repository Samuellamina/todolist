package spring.mvc.model;

import lombok.NonNull;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ToDoData {
    private static int idValue = 1;

    private final List<ToDoItem> items = new ArrayList<>();

    public ToDoData() {
        addItem(new ToDoItem("first", "fiest details", LocalDate.now()));
        addItem(new ToDoItem("secong", "secong details", LocalDate.now()));
        addItem(new ToDoItem("thirf", "thirf details", LocalDate.now()));
        addItem(new ToDoItem("zourth", "zourth details", LocalDate.now()));
    }

    public List<ToDoItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(@NonNull ToDoItem toAdd) {
        toAdd.setId(idValue);
        items.add(toAdd);
        idValue++;
    }

    public void removeItem(int id) {
        ListIterator<ToDoItem> itemListIterator = items.listIterator();

        while(itemListIterator.hasNext()) {
            ToDoItem item = itemListIterator.next();

            if(item.getId() == id) {
                itemListIterator.remove();
                break;
            }
        }
    }

    public ToDoItem getItem(int id) {
        for( ToDoItem item : items) {
            if(item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void updateItem(@NonNull ToDoItem toUpdate) {
        ListIterator<ToDoItem> itemListIterator = items.listIterator();

        while(itemListIterator.hasNext()) {
            ToDoItem item = itemListIterator.next();

            if(item.equals(toUpdate)) {
                itemListIterator.set(toUpdate);
                break;
            }
        }
    }
}

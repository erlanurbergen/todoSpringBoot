package com.erlankarabaliyev.todoapp.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String name;

    private Date date;

    private boolean done;

    // Сделать todo list используя spring boot. База postgre.
    //  Достаточно создать api для добавления, изменения, удаления, также отметить задачу как done.
    //  У задачи есть название, дата, приоритет и описание.
    //  Название, дата, приоритет обязательные при создании. Нужно залить код в github и скинуть ссылку


    public Todo() {
    }

    public Todo(String name, Date date, boolean done) {
        this.name = name;
        this.date = date;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}

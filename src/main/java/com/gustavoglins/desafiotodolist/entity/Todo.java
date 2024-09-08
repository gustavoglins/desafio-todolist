package com.gustavoglins.desafiotodolist.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_todos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

    public Todo(String title, String description, int priority, Boolean done) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.done = done;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private int priority;

    private Boolean done;
}

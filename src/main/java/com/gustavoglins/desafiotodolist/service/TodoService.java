package com.gustavoglins.desafiotodolist.service;

import com.gustavoglins.desafiotodolist.entity.Todo;

import java.util.List;

public interface TodoService {

    Todo create(Todo todo);

    List<Todo> listAll();

    Todo update(Todo todo);

    void delete(Long id);
}

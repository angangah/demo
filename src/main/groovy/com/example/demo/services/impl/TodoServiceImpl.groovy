package com.example.demo.services.impl

import com.example.demo.entities.Todo
import com.example.demo.repositories.TodoRepository
import com.example.demo.services.TodoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TodoServiceImpl implements TodoService {

    @Autowired
    TodoRepository todoRepository

    @Override
    List<Todo> findAll() {
        todoRepository.findAll()
    }

    @Override
    Todo findById(Integer todoId) {
        todoRepository.findById todoId get()
    }

    @Override
    Todo saveTodo(Todo todo) {
        todoRepository.save todo
    }

    @Override
    Todo updateTodo(Todo todo) {
        todoRepository.save todo
    }

    @Override
    Todo deleteTodo(Integer todoId) {
        todoRepository.deleteById todoId
    }
}

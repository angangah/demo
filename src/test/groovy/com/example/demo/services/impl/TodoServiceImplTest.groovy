package com.example.demo.services.impl

import com.example.demo.entities.Todo
import spock.lang.Specification

class TodoServiceImplTest extends Specification {

    def "findAll must return empty list"() {
        given:
        def todoServiceImpl = Mock(TodoServiceImpl)
        todoServiceImpl.findAll() >> []

        when:
        def all = todoServiceImpl.findAll()

        then:
        1 * todoServiceImpl.findAll() >> []
        all == []
    }

    def "findAll must return at least one todo"() {
        given:
        def todoServiceImpl = Mock(TodoServiceImpl)
        def todo = Mock(Todo) {
            it.id = 0
            it.task = 'task'
            it.isCompleted = Boolean.TRUE
        }
        todoServiceImpl.findAll() >> [todo]

        when:
        def all = todoServiceImpl.findAll()

        then:
        1 * todoServiceImpl.findAll() >> [todo]
        all == [todo]
    }

    def "findById must return one todo"() {
        given:
        def todoServiceImpl = Mock(TodoServiceImpl)
        def todo = Mock(Todo) {
            it.id = 0
            it.task = 'task'
            it.isCompleted = Boolean.TRUE
        }
        todoServiceImpl.findById(todo.id) >> todo

        when:
        def all = todoServiceImpl.findById(todo.id)

        then:
        1 * todoServiceImpl.findById(todo.id) >> todo
        all.id == todo.id
    }

}

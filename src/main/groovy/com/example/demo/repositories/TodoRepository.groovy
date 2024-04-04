package com.example.demo.repositories

import com.example.demo.entities.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository extends JpaRepository<Todo, Integer> {}

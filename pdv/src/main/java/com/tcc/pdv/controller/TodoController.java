package com.tcc.pdv.controller;

import com.tcc.pdv.model.Todo;
import com.tcc.pdv.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/lista-todos")
    public String listarTodos(Model model) {
        List<Todo> todos = todoRepository.findAll();
        model.addAttribute("todos", todos);
        return "todos";
    }

    @RestController
    @RequestMapping("/api/todos")
    public class TodoApiController {
        
        @GetMapping
        public List<Todo> getAllTodos() {
            return todoRepository.findAll();
        }

        @PostMapping
        public Todo createTodo(@RequestBody Todo todo) {
            return todoRepository.save(todo);
        }

        @GetMapping("/{id}")
        public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
            return todoRepository.findById(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
        }

        @PutMapping("/{id}")
        public ResponseEntity<Todo> updateTodo(@PathVariable Long id, @RequestBody Todo todoDetails) {
            return todoRepository.findById(id)
                    .map(todo -> {
                        todo.setTitulo(todoDetails.getTitulo());
                        todo.setDescricao(todoDetails.getDescricao());
                        todo.setConcluido(todoDetails.isConcluido());
                        Todo updatedTodo = todoRepository.save(todo);
                        return ResponseEntity.ok(updatedTodo);
                    })
                    .orElse(ResponseEntity.notFound().build());
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<?> deleteTodo(@PathVariable Long id) {
            return todoRepository.findById(id)
                    .map(todo -> {
                        todoRepository.delete(todo);
                        return ResponseEntity.ok().build();
                    })
                    .orElse(ResponseEntity.notFound().build());
        }
    }
} 
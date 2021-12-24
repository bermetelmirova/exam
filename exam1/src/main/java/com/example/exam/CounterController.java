package com.example.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class CounterController {
    @Autowired
    private CounterService counterService;

    @GetMapping
    public List<Counter> getAll() {
        return counterService.getReport();
    }

    @GetMapping("/{id}")
    public Counter getById() {
        return counterService.amount();
    }

    @PostMapping
    public void saveUser() {
        return counterService.counter();
    }
}

package com.example.poliarush;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public MyComponent() {
        System.out.println("1. Конструктор MyComponent: бін створюється...");
    }

    @PostConstruct
    public void init() {
        System.out.println("2. @PostConstruct: Бін MyComponent готовий до використання.");
    }

    public void doWork() {
        System.out.println("3. Виконання бізнес-логіки в MyComponent.");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("4. @PreDestroy: Бін MyComponent знищується, очищення ресурсів.");
    }
}
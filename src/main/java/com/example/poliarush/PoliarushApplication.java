package com.example.poliarush;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PoliarushApplication implements CommandLineRunner {

    // Spring автоматично знайде бін типу MyComponent у контейнері
    // і впровадить його в це поле.
    private final MyComponent myComponent;

    @Autowired
    public PoliarushApplication(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    public static void main(String[] args) {
        SpringApplication.run(PoliarushApplication.class, args);
    }

    // Цей метод виконається автоматично ПІСЛЯ запуску програми
    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Програма запущена, викликаємо наш компонент ---");
        myComponent.doWork();
        System.out.println("--- Робота програми завершується ---");
    }
}
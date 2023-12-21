package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HometaskTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HometaskTwoApplication.class, args);

        // Создаем объект класса Market
        Market market = new Market();

        // Добавляем клиентов в очередь
        market.enqueue("Customer 1");
        market.enqueue("Customer 2");
        market.enqueue("Customer 3");

        // Размещаем заказы
        market.takeOrder("Order 1");
        market.takeOrder("Order 2");

        // Выполняем заказы
        String completedOrder1 = market.completeOrder();
        String completedOrder2 = market.completeOrder();

        System.out.println("Completed Order 1: " + completedOrder1);
        System.out.println("Completed Order 2: " + completedOrder2);

        // Удаляем клиентов из очереди
        String removedCustomer = market.dequeue();
        System.out.println("Removed Customer: " + removedCustomer);

        // Обновляем состояние магазина
        market.update();
    }
}
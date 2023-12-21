package com.example.demo;
import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour<String>, MarketBehaviour {
    private Queue<String> customerQueue = new LinkedList<>();
    private Queue<String> orderQueue = new LinkedList<>();

    @Override
    public void enqueue(String customer) {
        customerQueue.offer(customer);
        System.out.println(customer + " has joined the queue.");
    }

    @Override
    public String dequeue() {
        String customer = customerQueue.poll();
        if (customer != null) {
            System.out.println(customer + " has left the queue.");
        }
        return customer;
    }

    @Override
    public void takeOrder(String order) {
        orderQueue.offer(order);
        System.out.println("Order for " + order + " has been placed.");
    }

    @Override
    public String completeOrder() {
        String order = orderQueue.poll();
        if (order != null) {
            System.out.println("Order for " + order + " has been completed.");
        }
        return order;
    }

    public void update() {
        System.out.println("Market has been updated.");
    }
}
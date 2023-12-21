package com.example.demo;

interface QueueBehaviour<T> {
    void enqueue(T item);
    T dequeue();
}
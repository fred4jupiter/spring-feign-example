package com.fred4jupiter.feignexample.api;

public class Customer {

    private String name;

    Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + '}';
    }
}

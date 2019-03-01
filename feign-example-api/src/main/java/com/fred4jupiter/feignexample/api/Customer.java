package com.fred4jupiter.feignexample.api;

public class Customer {


    private Integer id;

    private String name;

    Customer() {
    }

    public Customer(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + '}';
    }
}

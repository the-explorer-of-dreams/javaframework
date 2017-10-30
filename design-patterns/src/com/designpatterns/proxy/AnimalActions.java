package com.designpatterns.proxy;

public class AnimalActions implements Actions{
    private String name;
    AnimalActions(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(this.name + " is runing");
    }
}

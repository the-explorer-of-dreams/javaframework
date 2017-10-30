package com.designpatterns.staticproxy;

import com.designpatterns.proxy.Actions;
import com.designpatterns.proxy.AnimalActions;

public class StaticProxy {
    public static void main(String[] args) {
        Actions animalActions =  new AnimalActions("dog");
        Actions animalActionsProxy = new AnimalActionsProxy(animalActions);
        animalActionsProxy.run();
    }
}

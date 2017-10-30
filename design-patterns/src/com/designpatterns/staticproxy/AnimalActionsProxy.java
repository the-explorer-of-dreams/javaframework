package com.designpatterns.staticproxy;

import com.designpatterns.proxy.Actions;

public class AnimalActionsProxy implements Actions {
    private Actions objectBeProxied;
    public AnimalActionsProxy(Actions objectBeProxied){
        this.objectBeProxied =objectBeProxied;
    }

    @Override
    public void run() {
        System.out.println("process before run()");
        objectBeProxied.run();
        System.out.println("process after run()");
    }
}

package com.lectures.dp.interfacesegrigation;

/**
 * @author Ivan_Zhuravel
 */
public class FakeDuck implements StandartDuckBehavior {
    @Override
    public void quack() {
        System.out.println("pi pi pi ");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }

}

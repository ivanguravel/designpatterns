package com.lectures.dp.factory;

/**
 * @author Ivan_Zhuravel
 */
public class Main {

    public static void main(String[] args) {
        BeanFactory factory = new BeanFactory();
        SomeClass someClass =
                (SomeClass) factory.getBean("SomeClass");
        System.out.println(someClass.getTest());
    }
}

package com.lectures.dp.listener;

/**
 * @author Ivan_Zhuravel
 */
public class Main {

    public static void main(String[] args) {

        Event e = new EventImpl();

        ProxyDispatcher dispatcher = new ProxyDispatcher();

        Event event = dispatcher.eventProxy(e);

        event.doEvent();
    }
}

package com.lectures.dp.immutable;

/**
 * @author Ivan_Zhuravel
 */
public class Main {

    public static void main(String[] args) {
        Client client = new Client.Builder().setName("Vasya").setLastName("Pupkin").build();

        System.out.println(client);


    }
}

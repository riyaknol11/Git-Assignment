package com.knoldus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner takeInput=new Scanner(System.in);
        System.out.println("Enter the name of person");
        String name=takeInput.next();
        System.out.println("Enter the age of person");
        Integer age= takeInput.nextInt();

        Person person =new Person(name,age);

        System.out.println("name of the person: "+person.getName());
        System.out.println("age of the person: "+person.getAge());

        // calling the isAdult method to compare the age and displaying the result.
        System.out.println("Is the person adult: "+person.isAdult());
    }
}
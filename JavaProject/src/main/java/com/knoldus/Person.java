package com.knoldus;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

   // getter and setter methods to get and set the name,age of person.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    // isAdult method that returns a boolean indicating person is adult or not.
    public boolean isAdult(){
        if(this.age>18)
            return true;
        else
            return false;
    }
}

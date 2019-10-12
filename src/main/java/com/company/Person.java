package com.company;

public class Person {
    int Number;
    String Name;
    int Age;

    Person(int number, String name, int age)
    {
        Number =number;
        Name = name;
        Age = age;
    }

    @Override
    public String toString() {
        String s = "";
        s = Number + " " + Name + " " + Age;
        return s;
    }

    public void DoNothing()
    {
        return;
    }
}

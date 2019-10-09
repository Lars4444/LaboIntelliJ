package com.company;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

public class Main {

    public static void Recursive(int count)
    {
        System.out.println("In:" + count);

        if (count > 0)
        {
            Recursive(count-1);
        }

        System.out.println("End:" + count);
        return;
    }

    public class Animal
    {
        int age;
    }

    public class Dog extends Animal {
        String Sound;
    }
    
    public interface IPlayer{
        int age = 0;
    }

    public class Skater implements IPlayer
    {
        int speed = 0;
    }

    public class Goalie implements IPlayer
    {

    }
    



    public static void main(String[] args) {
	    // write your code here

        Recursive(5);

        System.exit(0);


        Person person1 = new Person(3, "Adam", 14);
        Person person2 = new Person(6, "Bertil", 18);
        Person person3 = new Person(9, "Ceasar", 25);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        LinkedList<Person> list = new LinkedList();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(2, person1);
        var index1 = list.indexOf(person1);
        var indexLast = list.lastIndexOf(person1);

        System.out.println("LinkedList:");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(index1);
        System.out.println(indexLast);

        //list.remove(person1);
        for (int i=list.size() - 1; i>= 0; i--) {
            if (list.get(i) == person1) {
                list.remove(i);
            }
        }
        System.out.println("LinkedList removed:");
        System.out.println(list);

        for(Person person : list) {
            System.out.println("Person: " + person);
        }


        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(3, "Adam");
        ht.put(6, "bertil");
        ht.put(9, "Ceasar");

        System.out.println("HashTable:");
        System.out.println(ht);

        Hashtable<Integer, Person> htp = new Hashtable<Integer, Person>();

        htp.put(17, person1);
        htp.put(34, person2);
        htp.put(51, person3);

        //System.out.println("a----------------------------a");
        System.out.println(htp);
        //System.out.println("b----------------------------b");

        var a34 = htp.get(34);
        System.out.println(a34);

        HashMap<Integer, Person> hmp = new HashMap<>();

        hmp.put(17, person1);
        hmp.put(34, person2);
        hmp.put(51, person3);

        System.out.println("HashMap:");
        System.out.println(hmp);

        var b34 = hmp.get(34);
        System.out.println(b34);




        //System.out.println("Hello!");

        //PrintNumbers printNumbers = new PrintNumbers();
        //printNumbers.print03();
    }



}


package org.example.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person(24,"Rahul")
        ,new Person(25,"Ajay")
        ,new Person(21,"Naman"),
                new Person(27,"Vivek"));
        System.out.println("List before sorting" +list);
        Collections.sort(list);
        System.out.println("List after sorting"+list);

    }
}

package org.example.comparator;



import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompratorTest {

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person(24,"Rahul")
                ,new Person(25,"Ajay")
                ,new Person(21,"Naman"),
                new Person(27,"Vivek"));
        System.out.println("List before sorting" +list);
        Collections.sort(list,new NameComarator());
        System.out.println("List after sorting"+list);


    }
}

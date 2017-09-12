package com.study.basis.thosethings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by lh on 2017/9/11.
 */
public class Example9 {

    public static void main(String[] args) {

        String string1 = new String("张三");
        String string2 = new String("张三");
        Set<String> stringSet = new HashSet<>();
        stringSet.add(string1);
        stringSet.add(string2);
        System.out.println("stringSet.size() = " + stringSet.size());

        Person person1 = new Person("张三", 25);
        Person person2 = new Person("张三", 25);
        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        System.out.println("personSet.size() = " + personSet.size());

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        Set<Person> personSet2 = new HashSet<>();
        personSet2.add(person1);
        System.out.println("person1.equals(person2):" + person1.equals(person2));
        System.out.println("personList.contains(person2):" + personList.contains(person2));
        System.out.println("personSet2.contains(person2):" + personSet2.contains(person2));
    }

}

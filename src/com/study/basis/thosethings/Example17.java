package com.study.basis.thosethings;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lh on 2017/9/12.
 */
public class Example17 {

    public static void main(String[] args) {

        List<Person> personList = new LinkedList<>();
        personList.add(new Person("张零", 20));
        personList.add(new Person("张一", 21));
        personList.add(new Person("张二", 22));
        personList.add(new Person("张三", 23));
        System.out.println("删除前 personList.size:" + personList.size());

        boolean remove = personList.remove(new Person("张二", 22));
        System.out.println("删除状态:" + remove);
        System.out.println("删除后 personList.size:" + personList.size());

    }

}

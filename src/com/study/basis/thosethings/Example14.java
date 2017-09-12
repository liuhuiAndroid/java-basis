package com.study.basis.thosethings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lh on 2017/9/12.
 */
public class Example14 {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("张零", 20));
        personList.add(new Person("张一", 21));
        personList.add(new Person("张二", 22));
        personList.add(new Person("张三", 23));
        personList.add(new Person("张四", 24));
        personList.add(new Person("张五", 25));
        personList.add(new Person("张六", 26));
        personList.add(new Person("张七", 27));
        personList.add(new Person("张八", 28));
        personList.add(new Person("张九", 29));
        Person person = new Person("李莫愁", 5);
        personList.add(2,person);

    }

}

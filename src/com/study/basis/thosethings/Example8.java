package com.study.basis.thosethings;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lh on 2017/9/11.
 * https://zhuanlan.zhihu.com/p/28216267
 */
public class Example8 {

    public static void main(String[] args) {

        Person person1 = new Person("张三", 25);
        Person person2 = new Person("李四", 25);
        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        System.out.println("personSet.size() = " + personSet.size());

    }

}

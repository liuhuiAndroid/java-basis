package com.study.basis.thosethings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lh on 2017/9/12.
 * https://zhuanlan.zhihu.com/p/28216267
 */
public class Example10 {

    public static void main(String[] args) {

        List<Person> list1 = new ArrayList<>();
        List<Person> list2 = new ArrayList<>();
        Person person = new Person("张三", 25);
        list1.add(person);
        list2.add(person);

    }

}

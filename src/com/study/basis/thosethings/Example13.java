package com.study.basis.thosethings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lh on 2017/9/12.
 * https://zhuanlan.zhihu.com/p/28216267
 */
public class Example13 {

    public static void main(String[] args) {

        Person[] group = new Person[10];

        group[0] = new Person("张零", 20);
        group[1] = new Person("张一", 21);
        group[2] = new Person("张二", 22);
        group[3] = new Person("张三", 23);
        group[4] = new Person("张四", 24);
        group[5] = new Person("张五", 25);
        group[6] = new Person("张六", 26);
        group[7] = new Person("张七", 27);
        group[8] = new Person("张八", 28);
        group[9] = new Person("张九", 29);

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
        personList.remove(5);
        personList.remove(new Person("张七", 27));
        personList.add(2,new Person("李莫愁",5));
    }

}

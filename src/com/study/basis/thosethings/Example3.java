package com.study.basis.thosethings;

/**
 * Created by lh on 2017/9/11.
 */
public class Example3 {

    public static void main(String[] args){
        String s3 = new String("100");
        String s4 = new String("100");
        System.out.println(s3.equals(s4));

        Integer itr = new Integer("123");
        Long lon = new Long("123");
        System.out.println(itr.equals(lon));

        Person person1 = new Person("张三",1);
        Person person2 = new Person("李四",2);
        System.out.println(person1.equals(person2));
    }

}

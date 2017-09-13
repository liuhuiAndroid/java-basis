package com.study.basis.thosethings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lh on 2017/9/11.
 * https://zhuanlan.zhihu.com/p/28216267
 */
public class Example22 {

    public static void main(String[] args){

        Map<String,Person> personMap = new HashMap<>();
        personMap.put("张三",new Person("张三",21));
        personMap.put("李四",new Person("李四",19));
        personMap.put("王五",new Person("王五",25));
        personMap.put("赵六",new Person("赵六",24));
        personMap.put("韩韦",new Person("韩韦",18));
        personMap.put("六六",new Person("六六",19));
        personMap.put("琪琪",new Person("琪琪",20));
        personMap.put("萌发",new Person("萌发",20));
        personMap.put("茶杯",new Person("茶杯",20));
        System.out.println("personMap.size()："+personMap.size());

    }

}

package com.study.basis.thosethings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lh on 2017/9/11.
 */
public class Example22 {

    public static void main(String[] args){
        Map<String,Person> personMap = new HashMap<>();
        personMap.put("张三",new Person("张三",21));
        personMap.put("李四",new Person("李四",19));
        personMap.put("王五",new Person("王五",25));
        personMap.put("赵六",new Person("赵六",24));
        System.out.println("personMap.size()："+personMap.size());
    }

}

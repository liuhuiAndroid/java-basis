package com.study.basis.thosethings;

/**
 * Created by lh on 2017/9/11.
 * https://zhuanlan.zhihu.com/p/28216267
 */
public class Example21 {

    public static void main(String[] args){
        MyMap<String,Person> myMap = new MyMap<>();
        myMap.put("张三",new Person("张三",21));
        myMap.put("李四",new Person("李四",19));
        myMap.put("王五",new Person("王五",25));
        myMap.put("赵六",new Person("赵六",24));

        System.out.println("赵六的年纪是："+myMap.get("赵六").getAge());
        System.out.println("myMap.size()："+myMap.size());
    }

}

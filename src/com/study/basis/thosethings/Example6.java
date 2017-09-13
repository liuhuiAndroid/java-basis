package com.study.basis.thosethings;

/**
 * Created by lh on 2017/9/11.
 * https://zhuanlan.zhihu.com/p/28216267
 */
public class Example6 {

    public static void main(String[] args) {
        int int1 = 100;
        int int2 = int1;
        int1 = 500;
        System.out.println("打印int1的值：" + int1);
        System.out.println("打印int2的值：" + int2);

        int[] intArr1 = new int[]{1, 2, 3, 4, 5};
        int[] intArr2 = intArr1;
        intArr1[3] = 8;
        System.out.println("打印intArr1[3]的值：" + intArr1[3]);
        System.out.println("打印intArr2[3]的值：" + intArr2[3]);

        Person person1 = new Person("张三", 21);
        Person person2 = person1;
        person1.setName("李四");
        person1.setAge(35);
        System.out.println("打印person1.getName()：" + person1.getName());
        System.out.println("打印person1.getAge()：" + person1.getAge());
        System.out.println("打印person2.getName()：" + person2.getName());
        System.out.println("打印person2.getAge()：" + person2.getAge());
    }

}

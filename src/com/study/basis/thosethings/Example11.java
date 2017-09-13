package com.study.basis.thosethings;

/**
 * Created by lh on 2017/9/12.
 * https://zhuanlan.zhihu.com/p/28216267
 */
public class Example11 {

    public static void main(String[] args) {

        Person[] personArr = new Person[5];
        personArr[0] = new Person("张三", 23);
        personArr[1] = new Person("张四", 24);
        personArr[2] = new Person("张五", 25);
        personArr[3] = new Person("张六", 26);
        personArr[4] = new Person("张七", 27);
//        personArr[5] = new Person("张八", 28);
        System.out.println("personArr.length:" + personArr.length);

        Person[] newPersonArr = new Person[10];
        System.arraycopy(personArr,0,newPersonArr,0,personArr.length);
        newPersonArr[5] = new Person("张八", 28);
        System.out.println("newPersonArr.length:" + newPersonArr.length);

    }

}

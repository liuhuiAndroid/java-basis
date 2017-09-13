package com.study.basis.thosethings;

/**
 * Created by lh on 2017/9/11.
 * https://zhuanlan.zhihu.com/p/28216267
 */
public class Example1 {

    public static void main(String[] args){

        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf(100);
        System.out.println(i3 == i4);

        Integer i5 = Integer.valueOf(1000);
        Integer i6 = Integer.valueOf(1000);
        System.out.println(i5 == i6);

        Integer i7 = new Integer(100);
        Integer i8 = new Integer(100);
        System.out.println(i7 == i8);
        System.out.println(i7.equals(i8));

    }

}

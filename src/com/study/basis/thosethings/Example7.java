package com.study.basis.thosethings;

/**
 * Created by lh on 2017/9/11.
 * https://zhuanlan.zhihu.com/p/28216267
 */
public class Example7 {

    public static void main(String[] args){

        Integer i3 = 100;
        Integer i4 = 100;
        System.out.println(i3 == i4);

        Integer i5 = 1000;
        Integer i6 = 1000;
        System.out.println(i5 == i6);

        //装箱 Integer.valueOf(100);
        Integer integer1 = 100;
        //拆箱 integer1.intValue();
        int int1 = integer1;

        Long long1 = 100L;
        long l1 = long1;

        Boolean boolean1 = true;
        boolean bool = boolean1;


    }

}

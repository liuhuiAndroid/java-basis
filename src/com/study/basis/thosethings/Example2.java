package com.study.basis.thosethings;

/**
 * Created by lh on 2017/9/11.
 * https://zhuanlan.zhihu.com/p/28216267
 */
public class Example2 {

    public static void main(String[] args){

        String i3 = "100";
        String i4 = "100";
        System.out.println(i3 == i4);

        String i5 = new String("100");
        String i6 = new String("100");
        System.out.println(i5 == i6);

    }

}

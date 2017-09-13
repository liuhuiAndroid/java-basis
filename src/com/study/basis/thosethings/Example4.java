package com.study.basis.thosethings;

/**
 * Created by lh on 2017/9/11.
 * https://zhuanlan.zhihu.com/p/28216267
 */
public class Example4 {

    public static void main(String[] args) {

        // 一维数组
        char[] charArr1 = {'a', 'b', 'c'};
        char[] charArr2 = new char[]{'a', 'b', 'c'};
        char[] charArr3 = new char[5];
        charArr3[0] = '1';
        charArr3[1] = '0';
        charArr3[2] = '0';
        charArr3[3] = '8';
        charArr3[4] = '0';

        System.out.println(charArr1);
        System.out.println(charArr2);
        System.out.println(charArr3);

        System.out.println(" ----------------------- ");

        // 二维数组
        char[][] x = {{'a', 'b', 'c'}, {'c', 'd', 'e'}, {'f', 'g', 'h', 'i'}};
        char[][] y = new char[][]{{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9', '0'}};
        char[][] z = new char[2][3];
        z[0][0] = 'a';
        z[0][1] = 'b';
        z[0][2] = 'c';
        z[1][1] = '1';
        z[1][1] = '2';

        System.out.println(x);
        System.out.println(y.toString());
        System.out.println(z.toString());

        System.out.println(" ----------------------- ");
        char[] charArrTest = {'a','b','c'};
        char[] charArrTest2 = charArrTest;
        charArrTest[1] = 'x';
        System.out.println(charArrTest2);
    }

}

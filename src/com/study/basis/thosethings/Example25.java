package com.study.basis.thosethings;

/**
 * Created by lh on 2017/9/11.
 * https://zhuanlan.zhihu.com/p/28216267
 */
public class Example25 {

    public static void main(String[] args) {

        int DEFAULT_INITIAL_CAPACITY1 = 1 << 1;
        int DEFAULT_INITIAL_CAPACITY2 = 1 << 2;
        int DEFAULT_INITIAL_CAPACITY3 = 1 << 3;
        int DEFAULT_INITIAL_CAPACITY4 = 1 << 4;
        System.out.println("DEFAULT_INITIAL_CAPACITY1:" + DEFAULT_INITIAL_CAPACITY1);
        System.out.println("DEFAULT_INITIAL_CAPACITY1:" + DEFAULT_INITIAL_CAPACITY2);
        System.out.println("DEFAULT_INITIAL_CAPACITY1:" + DEFAULT_INITIAL_CAPACITY3);
        System.out.println("DEFAULT_INITIAL_CAPACITY1:" + DEFAULT_INITIAL_CAPACITY4);


        System.out.println("int最大正数：" + Integer.MAX_VALUE);
        System.out.println("int最大正数二进制表示：" + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("int最小负数：" + Integer.MIN_VALUE);
        System.out.println("int最小负数二进制表示：" + Integer.toBinaryString(Integer.MIN_VALUE));

        System.out.println("二进制定义打印int能表示的最大数：" + 0b01111111_11111111_11111111_11111111);
        System.out.println("二进制定义打印int能表示的最小数：" + 0b10000000_00000000_00000000_00000000);

        System.out.println("43的二进制表现：" + Integer.toBinaryString(43));//结果省略了前面的0
        System.out.println("-43的二进制表现：" + Integer.toBinaryString(-43));

        //下划线无意义，只是为了方便看，可以随意写
        int a = 0b00000000_00000000_00000000_00000000_00101011;//0b表示为二进制，a相当于十进制的43
        int a1 = 0b101011;//这也是十进制的43，只不过省略了上面的0
        System.out.println("打印a的值：" + a);
        System.out.println("打印a1的值：" + a1);
        int b = 0b11111111_11111111_111111111_1010101;//二进制43取反加1，变成-43，下划线无意义
        System.out.println("打印b的值：" + b);

        int i = 0b00000001_00110010_01100111_10101101;//随手写了个十进制的24274861
        System.out.println("打印10进制的i：" + i);
        System.out.println("打印强制转换为short的i：" + (short)i);
        System.out.println("打印short的二进制表示：" + Integer.toBinaryString((short)i));

        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE - 1);
    }

}

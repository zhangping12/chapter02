package E26;

import java.util.Scanner;

/**
 * 程序开发中常用的乘法运算是通过“*”运算符或者BigDecimal类的multiply()方法实现的。
 * 本实例将介绍在这两种方法之外如何实现乘法，而且实现的运算效率非常高。
 *
 * 创建Example类，在该类的主方法中接收用户输入的一个整数，然后对该整数执行位运算中的左移操作，并输出运算结果
 */
public class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //创建扫描器
        System.out.println("请输入一个整数");
        Long number = scan.nextLong();//获取输入的整数
        System.out.println("你输入的数字是："+number);
        System.out.println("该数字乘以2的运算结果为："+(number<<1));
        System.out.println("该数字乘以4的运算结果为："+(number<<2));
        System.out.println("该数字乘以8的运算结果为："+(number<<3));
        System.out.println("该数字乘以16的运算结果为："+(number<<4));
    }
}
//通过实例可以看出，一个整数每次执行位移运算中的左移运算n次，相当于这个整数乘以2的n次方。相反，如果执行右移n次方，则
//相当于这个整数除以2的n次方。
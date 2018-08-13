package E24;

import java.util.Scanner;

/**
 * 三元运算符是if……else条件语句的简写格式，它可以完成简单的条件判断。
 *
 * 本实例的关键内容就是以三元运算符实现简单的条件判断。语法格式如下：
 * 条件运算？运算结果1：运算结果2；
 * 如果条件运算结果为true，返回值就是运算结果1，否则返回结果2.
 * 另外，本实例使用扫描器的nextLong()方法直接获取了整型数据，避免了类型转换等业务代码。该方法的声明格式如下：
 * public long nextLong()
 * 该方法返回一个long类型的数值，这个数是从扫描器封装的输入流中获取的
 *
 * 创建ParityCheck类，在该类的主方法中创建标准输入流的扫描器对象，提示用户输入一个整数，并通过扫描器的方法来接收
 * 一个整数，通过三元运算符判断该数字与2的余数，如果余数为0说明其是偶数，否则是奇数
 */

public class ParityCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//创建输入流扫描器
        System.out.println("请输入一个整数：");
        long number = scan.nextLong();  //获取用户输入的整数
        String check = (number%2==0)?"这个数字是：偶数":"这个数字是：奇数";
        System.out.println(check);
    }
}

//"%"运算符的用途非常广泛，它能够实现数据项分页，最简单的方法是可以通过计算奇偶数的方法把数组交叉分成为两个数组。它还可以
//限制数字的范围，如（N%5==0）可以限制数字N在0~4的范围内。

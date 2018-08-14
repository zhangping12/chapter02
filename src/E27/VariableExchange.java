package E27;

import java.util.Scanner;

/**
 * 变量的互换常见于数组排序算法中，当判断两个数组元素需要交互时，将创建一个临时变量来共同完成互换，临时变量的创建增加了
 * 系统资源的消耗，如果需要交换的是两个整数类型的变量，那么可以使用更高效的方法。
 * 本实例演示了如何省略临时变量实现两个整数类型变量的高效互换。
 *
 * 创建VariableExchange类，在该类的主方法中创建扫描器对象接收用户输入的两个变量值，然后通过位运算中的异或运算符“^”
 * 实现两个变量的互换。
 *
 * 两值相同异或为0；两值不同异或为1
 */
public class VariableExchange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//创建扫描器
        System.out.println("请输入变量A的值");
        long A = scan.nextLong();//接收第一个变量值
        System.out.println("请输入变量B的值");
        long B = scan.nextLong();//接收第二个变量值
        System.out.println("A="+A+"\tB="+B);
        System.out.println("执行变量互换...");
        A = A ^ B;
        B = B ^ A;
        A = A ^ B;
        System.out.println("A="+A+"\tB="+B);
    }
}
//异或"^"和其他位运算符并不会改变变量本身的值，即"A ^ B",没有任何意义，必须将运算结果赋值给一个变量。
// 疲惫的开发人员经常犯此类错误。
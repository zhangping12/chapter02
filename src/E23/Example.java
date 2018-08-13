package E23;

import java.util.Scanner;

/**
 * 本实例通过位运算的“^”异或运算符把字符串与一个指定的值进行异或运算，从而改变字母串每个字符串的值，
 * 这样就可以得到一个加密后的字符串。当把加密后的字符串作为程序输入内容，异或运算会把加密后的字符串还原为原有
 * 字符串的值。
 *
 * 创建Example类，在该类的主方法中创建System类的标准输入流的扫描器对象，提示用户输入一个英文
 * 字符串或者要解密的字符串，然后通过扫描器获取用户输入的字符串，经过加密或解密后，把字符串通过错误流输出到控制台。
 *
 * 程序最后使用标准错误输出流不是用于输出错误信息，而是利用了其在eclipse控制台以红色显示的特性突出显示
 */
public class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个英文字符串或解密字符串");
        String password = scan.nextLine();   //获取用户输入
        char[] array = password.toCharArray();//获取字符数组
        for (int i = 0; i < array.length; i++) {//遍历字符数组
            array[i] = (char)(array[i]^20000); //对每个数组元素进行异或运算
        }
        System.out.println("加密或解密结果如下：");
        System.err.println(new String(array));//输出密钥
    }
}
//灵活运用位运算可以实现很多高级、高效的算法。例如，一个数字的位移运算，每左移n位就等于这个数乘以2的n次方，每右移n位就等于
//除以2的n次方，而且这个算法非常快

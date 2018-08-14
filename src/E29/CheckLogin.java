package E29;

import java.util.Scanner;

/**
 * 大多系统登录模块都会接收用户通过键盘输入的登录信息，这些登录信息将会被登录模块验证，如果使用的是指定的用户名与密码，
 * 则允许程序登录；否则将用户拒之门外。本实例通过if……else语句进行多条件判断实现了登录信息验证，
 *
 */
public class CheckLogin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//创建扫描器
        System.out.println("请输入登录用户名：");
        String username = scan.nextLine();//接收用户输入登录名
        System.out.println("请输入登录密码：");
        String password = scan.nextLine();//接收用户输入登录密码
        if(!username.equals("mr")){//判断用户名合法性
            System.out.println("用户名非法。");
        }else if (!password.equals("mrsoft")){//判断密码合法性
            System.out.println("登录密码错误。");
        }else{                               //通过以上两个条件判断则默认通过登录验证
            System.out.println("恭喜您，登录信息通过验证。");
        }
    }
}
//字符串属于对象而并非基本数据类型，不能够使用“==”来判断两个字符串是否相等，所以需要通过equals()方法来判断两个字符串
//内容是否相同。如果使用“==”判断的将是两个字符串对象的内存地址，而非字符串内容。
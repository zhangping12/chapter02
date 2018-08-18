package E30;

import java.util.Scanner;

/**
 * 本实例根据用户输入的信息确定员工应该分配到哪个部门。实例中需要根据用输入进行多条件判断，所以采用了Switch语句。
 * 本实例的关键技术在于switch多分支语句的使用，该语句只支持对常量的判断，而常量又只能是Java的基本数据，虽然在以后的JDK
 * 版本中可以对String类的字符串对象进行判断，但是就目前的需求来说也有很多需要对字符串进行多条件判断的。
 * 本实例采取的做法是对字符串的哈希码进行判断，也就是把String类的hashCode（）方法返回值作为Switch语法的表达式，case关键字
 * 之后跟随的是各种字符串常量的哈希码整数值。
 */
public class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入新员工的姓名");
        String name = scan.nextLine();//接收员工名称
        System.out.println("请输入新员工应聘的编程语言：");
        String language = scan.nextLine();//接收员工应聘的编程语言
        //根据编程语言确定员工分配的部门
        switch(language.hashCode()){
            case 3254818:             //Java的哈希码
            case 2301506:             //Java的哈希码
            case 2269730:             //Java的哈希码
                System.out.println("员工"+name+"被分配到Java程序开发部门。");
                break;
            case 3104:               //C#的哈希码
            case 2112:               //C#的哈希码
                System.out.println("员工"+name+"被分配到C#项目维护组。");
                break;
            case -709190099:         //Asp.net的哈希码
            case 955463181:          //Asp.net的哈希码
            case 9745901:            //Asp.net的哈希码
                System.out.println("员工"+name+"被分配到Java程序开发部门。");
                break;
            default:
                System.out.println("本公司不需要"+language+"语言的程序开发人员");
        }
    }
}
//在switch语法中每个case关键字可以作为一个条件分支，但是对于多个条件采取相同业务处理的情况，可以把多个case分支关联在一起
//省略他们之间的break语句，而在最后一个相同的case分支中实现业务处理并执行break语句。
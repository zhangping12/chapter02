package E28;

import java.util.Scanner;

/**
 * 为了弥补因人为历法规定造成的年度天数与地球实际公转周期的时间差，设立了366天闰年，闰年的二月份有29天。
 * 满足两种条件的整数可以称为闰年，第一，能被4整除但不能被100整除；第二，能被400整除
 * 该公式yongJava语法实现的格式如下：
 * year % 4==0&&year % 100!=0||year % 400==0
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        long year = scan.nextLong();//接收用户输入
        if(year % 4==0&&year % 100!=0||year % 400==0){//是闰年
            System.out.println(year + "是闰年！");
        }else{
            System.out.println(year + "不是闰年！");
        }
    }
}
//三元运算符（？：）是if……else语句的一个简洁写法，可以根据需求来决定使用哪个。前者常用于赋值判断，后者常用于业务流程。

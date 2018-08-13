package E25;

import java.math.BigDecimal;

/**
 * 浮点运算的典型事例是货币运算，在商品金额计算中，经常会涉及小数运算，如某个商品的价格是1.10元，而顾客现有金额是
 * 2元整。在计算机中所有数字都是使用二进制进行存储的，而二进制无法精确地表示所有的小数，所以使用基本数据类型进行
 * 小数运算会有一些误差，本实例将通过BigDecimal类实现精确地小数运算。
 *
 * 本实例在完成浮点数精确计算的过程中使用了BigDecimal类，它用于大数字的精确计算。
 *
 * 1、加法
 *该方法实现两个BigDecimal类实例对象的加法运算，并将运算结果作为方法的返回值。该方法的声明如下：
 * public BigDecimal add(BigDecimal augend)
 * 参数说明
 * augend：与当前对象执行加法的操作数
 *
 * 2、减法
 *该方法实现两个BigDecimal类实例对象的减法运算，并将运算结果作为方法的返回值。该方法的声明如下：
 * public BigDecimal subtract(BigDecimal subtrahend)
 *参数说明
 * subtrahend：与当前对象执行减法的操作数
 *
 * 3、乘法
 * 该方法实现两个BigDecimal类实例对象的乘法运算，并将运算结果作为方法的返回值。该方法的声明如下：
 * public BigDecimal multiply(BigDecimal multiplicand)
 * 参数说明
 * multiplicand：乘法运算中乘数
 *
 * 4、除法
 *该方法实现两个BigDecimal类实例对象的除法运算，并将运算结果作为方法的返回值。该方法的声明如下：
 * public BigDecimal divide(BigDecimal divisor)
 * 参数说明
 * divisor：除法运算中的除数
 *
 * 这里创建BigDecimal类的实例时，在构造方法中一定要使用数字字符串作为参数，如果直接使用浮点数或该类型的变量作为参数，那么
 * 构造方法接收的是经过二进制存储的浮点数，这样就会是不精确的浮点数
 */

public class AccuratelyFloat {
    public static void main(String[] args) {
        double money = 2; //现有金额
        double price = 1.1; //商品价格
        double result = money - price;
        System.out.println("非精确计算");
        System.out.println("剩余金额："+result);//输出运算结果
        //精确浮点数的解决方法
        BigDecimal money1 = new BigDecimal("2");//现有金额
        BigDecimal price1 = new BigDecimal("1.1");//商品单价
        BigDecimal result1 = money1.subtract(price1);
        System.out.println("精确计算");
        System.out.println("剩余金额："+result1);//输出精确结果
    }
}
//对于商业程序的开发，一定要注意其中的货币运算，因为计算机无法通过二进制精确第表示所有小数，
// 所以计算机中的小数运算会有一定的误差。虽然误差非常小，但是货币运算可能会操作多个有误差的运算结果，
//长期的数据累计会造成更大的误差，特别是银行使用的系统不允许任何微小的误差，所以读者应熟练掌握BigDecimal类的用法

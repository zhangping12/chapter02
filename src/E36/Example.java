package E36;

import java.math.BigDecimal;

/**
 * 由于本实例的运行结果精度非常高，小数位数过长，所以特殊设置了控制台折行，读者的运行结果可能是单行的数字
 */
public class Example {
    public static void main(String[] args) {
        BigDecimal sum = new BigDecimal(0.0); //和
        BigDecimal factorial = new BigDecimal(1.0);//阶乘项的计算结果
        int i = 1;//循环增量
        while (i<=20){
            sum = sum.add(factorial);//累加各项阶乘的和
            ++i;//i加1
            factorial = factorial.multiply(new BigDecimal(1.0/i));//计算阶乘项
        }
        System.out.println("1+1/2!+1/3!……1/20!的计算结果等于：\n"+sum);//输出结算结果
    }
}
//对于高精度要求或者运算数较大的计算，应该使用BigDecimal类实现，否则Java基本数据类型的数据无法保证浮点数的精度，
// 也无法对超出其表示范围的数字进行运算。

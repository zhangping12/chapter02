package E22;

/**
 * Java基本数据类型之间存在自动转换类型与强制类型转换两种转换方法。注意long类型向short类型转换时发生的数据丢失
 *
 * 创建TypeConversion类，在该类的主方法中创建各种基本类型的变量，在输出语句中分别输出所有变量累加值。
 * 注意每次累加值的数据类型，所有整数运算都被自动转换为int类型在进行运算，所有浮点数值都被自动转换为double
 * 类型进行运算。最后把高类型数据向低类型数据进行强制类型转换，并注意运算结果是否丢失数据。
 * 关键代码如下：
 *
 */
public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        char c = 'W';
        short s = 23561;
        int i = 3333;
        long l = 400000L;
        float f = 3.14159F;
        double d = 54.523;
        //低类型向高类型自动转化
        System.out.println("累加byte等于：" + b);
        System.out.println("累加char等于：" + (b+c));
        System.out.println("累加short等于：" + (b+c+s));
        System.out.println("累加int等于：" + (b+c+s+i));
        System.out.println("累加long等于：" + (b+c+s+i+l));
        System.out.println("累加float等于：" + (b+c+s+i+l+f));
        System.out.println("累加double等于：" + (b+c+s+i+l+f+d));
        //高类型到低类型的强制转换
        System.out.println("把long强制类型转换为int："+(int)l);
        //高类型到低类型转换会丢失数据
        System.out.println("把int强制类型转换为short："+(short)l);
        //实数到整数转换将舍弃小数部分
        System.out.println("把double强制类型转换为int："+(int)d);
        //整数到字符类型的转换将获取对应编码的字符
        System.out.println("把short强制类型转换为char："+(char)s);
    }
}

//在输出语句中，经常对输出的数字添加一个描述前缀。例如，“他的年龄是45”，但是若果“45”是一个数学加法的公式，那么很容易
//出现错误的运算。首先第一个数字与字符串会通过“+”符号实现字符串连接，而其后的所有数字加法运算都会被看做字符串的连接操作。
//解决办法是把所有数字加法用括号括起来。

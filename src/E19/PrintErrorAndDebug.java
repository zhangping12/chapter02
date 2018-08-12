package E19;

/**
 *System 类中的out和err两个成员变量来完成调试信息与错误信息的输出，他们都是System的类变量
 * 也就是说使用static关键字修饰的。out是标准调试信息的输出流，err是标准错误信息输出流
 * 该方法的声明如下：
 * public void println（String x）
 * 参数说明
 * x：被输出到控制台的字符串
 **/
public class PrintErrorAndDebug{
    public static void main(String[] args){
        System.out.println("mian()方法开始运行了。");
        // 输出错误信息
        System.err.println("在运行期间手动输出一个错误信息:");
        System.err.println("\t 该软件没有买保险，请注意安全");
        System.out.println("E019.PrintErrorAndDebug.main()");
        System.out.println("main()方法运行结束");
    }
}
/*
System 类的out与err是两个类成员变量，不用创建System类的实例对象就可以直接使用。虽然都是标准输出流，
但是应该灵活运用它们完成不同的信息输出，out主要是输出调试信息的输出流，在Eclipse控制台中以黑色字体标识；
而err是错误信息的标准输出流，用于输出紧急错误信息，所以在Eclipse控制台中以红色字体显示。
*/

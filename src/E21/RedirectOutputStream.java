package E21;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * System类中的out成员变量是Java的标准输出流，程序常用它来输出调试信息，out成员变量被定义为final类型的，
 * 无法直接重新赋值，但是可以通过setOut（）方法来设置新的输出流。本实例利用该方法实现了输出流的重定向，把它指向一个文件
 * 输出流，从而实现了日志功能。程序运行后绘制控制台提示。但是在运行过程中的步骤都保存到日志文件中
 *
 * 本实例应用的关键技术是调用了System类中的setOut（）方法改变了输出流，System类的out、err和in成员变量是final类型的，不能
 * 直接赋值，要通过相应的方法来改变流。下面分别介绍改变这3个成员变量的方法。
 *1、setOut方法
 * 该方法用于重新分配System类的标准输出流。该方法的声明如下：
 * public static setOut(PrintStream out)
 * 参数说明
 * out：新的PrintStream输出流对象
 * 2、setErr方法
 * 该方法用于重新分配System类的标准错误输出流。该方法的声明如下：
 * public static setErr(PrintStream err)
 * 参数说明
 * err：新的PrintStream输出流对象
 * 3、setIn方法
 * 该方法用于重新设置System类的in成员变量，即标准输入流
 *
 *
 * 创建RedirectOutputStream类，编写该类的main（）主方法，在该方法中保存System类的out成员变量为临时变量，然后创建一个新的
 * 文件输出流，并把这个输出流设置为System类的新输出流。在程序的关键位置输出调试信息，这些调试信息将通过新的输出流保存到
 * 日志文件中。最后恢复原有输出流并输出程序运行结束信息
 */
public class RedirectOutputStream {
    public static void main(String[] args) {
        try {
            PrintStream out = System.out;    //保存原输出流
            PrintStream ps = new PrintStream("./log.txt");  //创建文件输出流
            System.setOut(ps);//设置使用新的输出流
            int age = 18; //定义整型变量
            System.out.println("年龄变量成功定义，初始值为18");
            String sex = "女";//定义字符串变量
            System.out.println("性别变量定义成功，初始值为女");
            //整合两个变量
            String info = "这是个"+sex+"孩子，应该有"+age+"岁了。";
            System.out.println("整合两个变量为info字符串变量，其结果是："+info);
            System.setOut(out);//恢复原有输出流
            System.out.println("程序运行完毕，请查看日志文件。");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
//参考本实例的做法，可以把err标准错误输出流也重定向到其他位置。例如，可以定义在于标准输出流相同的文件输出流中，
// 但是在输出错误信息是，添加“警告：”字样，可以为日志添加信息级别

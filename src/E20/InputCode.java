package E20;
import java.util.Scanner;

/**
 * 用到了System类的输入流也就是类变量in，他可以接收用户的输入信息，并且是标准的输入流实例对象。另外，
 * Scanner类是java的扫描器类，它可以从输入流中读取指定类型的数据或字符串。本实例使用Scanner类封装了输入流对象，并使用
 * nextLine（）方法从输入流中获取用户输入的整行文本字符串，该方法的声明如下：
 * public String nextLine（）
 * 该方法从扫描器封装的输入流中获取一行文本字符串作为方法的返回值
 *
 * 创建InputCode类，在该类的主方法中创建Scanner扫描器来封装System类的in输入流，然后提示用户输入身份证号码，
 * 并输出用户身份证号码的位数，关键代码如下：
 */
public class InputCode{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //创建输入流的扫描器
        System.out.println("请输入你的身份证号："); //提示用户输入
        String line = scanner.nextLine();           //获取用户输入的一行文本
        //打印对输入文本的描述
        System.out.println("原来你身份证号是"+line.length()+"位数字的啊");
    }
}

//InputStream输入流以字节为单位来获取数据，而且需要复杂的判断并创建字节数组作为缓冲，最主要的是字节转换为字符时容易出现
//中文乱码的情况，所以对字符串的读取，应该使用扫描器进行封装，然后获取字符串类型的数据
package E38;

import java.util.ArrayList;
import java.util.List;

/**
 * foreach循环是for循环的一种简写格式，只用于遍历数据集合或数组，语法格式如下：
 * for(Type e:collections){
 *     //对变量e的使用
 * }
 * 参数说明
 * e:其类型Type是集合或数组中元素值得类型，该参数是集合或数组collections中的一个元素。
 * collections：要遍历的集合或数组，也可以是迭代器。
 * 在循环体中使用参数e，该参数是foreach从集合或数组以及迭代器中取得的元素值，元素值是从头到尾进行遍历
 *
 * 创建UseForeach类，在该类的主方法中创建List集合对象，并为该对象添加内容，然后使用foreach循环遍历该集合输出所有内容，
 * 再从List集合中提取一个字符串数组，然后使用foreach循环遍历该数组，所有数组元素输出到控制台。
 */
public class UseForeach {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>(); //创建List集合
        list.add("abc");
        list.add("def");
        list.add("hij");
        list.add("klm");
        list.add("nop");
        list.add("qrs");
        System.out.println("foreach遍历集合： \n\t");
        for (String string : list){   //遍历List集合
            System.out.println(string); //输出集合的元素值
        }
        System.out.println();
        String[] strs = new String[list.size()];
        list.toArray(strs); //创建数组
        System.out.println("foreach遍历数组：\n\t");
        for (String string:strs){    //遍历数组
            System.out.println(string);//输出数组元素值
        }
    }
}
//在JDK1.5之前使用for循环对集合、数值和迭代器进行遍历，需要创建索引变量、条件表达式，这样会造成代码混乱，并增加出错的几率
//并且每次循环中索引变量或迭代器都会出现3次，有两次出错的机会。而且会有一些性能损失，其性能稍微落后于foreach循环。所以
//对于数据集合的遍历，建议使用foreach循环完成
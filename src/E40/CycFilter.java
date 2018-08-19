package E40;

/**
 * 循环体中可以通过break语句中断整个循环，这增加了循环的控制能力，但是对于特殊情况还是不够，
 * 例如某些条件下需要放弃部分循环处理，而不是整个循环体。Java提供了continue语句来实现这一功能，
 * continue可以放弃本次循环体的剩余代码，不执行它们而开始下一轮的循环。本实例利用continue语句
 * 实现了循环体过滤器，可以过滤“老鹰”字符串，并做出相应的处理，但是放弃continue语句之后的所有代码。
 */
public class CycFilter {
    public static void main(String[] args) {
        //创建数组
        String[] array = new String[]{"白鹭","丹顶鹤","黄鹂","鹦鹉","乌鸦","喜鹊","老鹰","布谷鸟","老鹰",
                "灰纹鸟","老鹰","百灵鸟"};
        System.out.println("在我的花园里有很多鸟类，但是最近来了几只老鹰，请帮我把它们抓走。");
        int eagleCount = 0;
        for (String string:array) {//foreach遍历数组
            if(string.equals("老鹰")){//如果遇到老鹰
                System.out.println("发现一只老鹰，已经抓到笼子里。");
                eagleCount++;
                continue;  //中断循环
            }
            System.out.println("搜索鸟类，发现了："+string); //否则输出数组元素
        }
        System.out.println("一共捉到了："+eagleCount+"只老鹰。");
    }
}
//break语句和continue语句都是对循环体的控制语句，它们不仅应用于for循环，在任何循环体中都可以使用这些语句，
//灵活使用可以让循环实现更加复杂的运算和业务处理。

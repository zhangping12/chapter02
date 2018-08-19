package E39;

public class BreakCyc {
    public static void main(String[] args) {
        System.out.println("\n----------中断单层循环的例子。------------");
        //创建数组
        String[] array = new String[]{"白鹭","丹顶鹤","黄鹂","鹦鹉","乌鸦","喜鹊",
                "老鹰","布谷鸟","老鹰","灰纹鸟","老鹰","百灵鸟"};
        System.out.println("在你发现第一只老鹰之前，告诉我都有什么鸟。");
        for (String string : array){    //foreach遍历数组
            if (string.equals("老鹰"))  //如果遇到老鹰
                break;                  //中断循环
                System.out.print("有："+string+"      ");//否则输出数组元素
        }
        System.out.println("\n\n---------中断双层循环的例子。---------");
        //创建成绩数组
        int[][] myScores = new int[][]{{67,78,63,22,66},{55,68,78,95,44},{95,97,92,93,81}};
        System.out.println("宝宝这次考试成绩：\n数学\t语文\t英语\t美术\t历史");
        No1:for(int[] is : myScores){  //遍历成绩表格
            for (int i : is){
                System.out.println(i + "\t"); //输出成绩
                if(i < 60){//如果中途遇到不及格的，立刻中断所有输出
                    System.out.println("\n等等，"+i+"分的是什么？这个为什么不及格？");
                    break No1;//中断整个双层循环
                }
            }
            System.out.println();
        }
    }
}
//用break避免死循环。充分利用循环可以可以提高程序的开发与执行效率，但是如果不注重循环中的算法很容易导致程序的死循环，
// 那将是程序的死穴。所以在循环体中要对可能出现的特殊情况使用break语句中断循环。

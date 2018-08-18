package E34;

/**
 * 杨辉三角形由数字排列，可以把它看做一个数字表，基本特性是两侧数值均为1，其他位置的数值是其正上方的数值与左上角数值之和。
 * 创建YanghuiTriangle类，在该类的主方法中创建一个二维数组，并指定二维数组的第一维长度，这个数组用于存放杨辉三角形的数值
 * 表，通过双层for循环来实现第二维数组的长度，然后计算整个数组的每个元素的值。
 */
public class YanghuiTriangle {
    public static void main(String[] args) {
        int triangle[][] = new int[8][]; //创建二维数组
        //遍历二维数组的第一层
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i+1];  //初始化第二层数组的大小
            //遍历二维数组的第二层
            for (int j = 0; j < triangle[i].length-1; j++) {
                //将两侧的数组元素赋值为1
                if (i==0||j==0||j==triangle[i].length-1){
                    triangle[i][j]=1;
                }else{//其他数值通过公式计算
                    triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
                }
                //输出数组元素
                System.out.println(triangle[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
//Java二维数组可以不等长。Java语言中的二维数组其实是一维数组的每个元素都是另一个一维数组，所以第二维数组的长度可以任意。
//这比其他语言的数组更灵活，而且多维数组也是如此。

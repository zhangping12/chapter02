package E37;

/**
 * 创建Diamond类，在该类的主方法中调用printHollowRhombus（）方法完成10行的空心菱形输出，其中printHollowRhombus（）方法是
 * 实例中自定义的，该方法使用两个双层for循环分别输出菱形的上半部分与下半部分。
 */
public class Diamond {
    public static void main(String[] args) {
        printHollowRhombus(10);
    }

    public static void printHollowRhombus(int size) {
        if(size%2 == 0){
            size++;   //计算菱形大小
        }
        for (int i = 0; i < size/2+1; i++) {
            for (int j = size/2+1; j > i+1 ; j--) {
                System.out.println("");//输出左上角位置的空白
            }
            for (int j = 0; j < 2*i+1; j++) {
                if (j==0||j == 2*i){
                    System.out.println("*"); //输出菱形上半部边缘
                }else{
                    System.out.println("");//输出菱形上半部空心
                }
            }
            System.out.println("");
        }
        for (int i = size/2+1; i <size ; i++) {
            for (int j=0;j< i - size/2;j++){
                System.out.println("");//输出菱形左下角空白
            }
            for (int j = 0; j < 2*size-1-2*i; j++) {
                if(j==0||j==2*(size-i-1)){
                    System.out.println("*");//输出菱形下半部边缘
                }else{
                    System.out.println("");//输出菱形下半部空心
                }
            }
            System.out.println("");
        }
    }
}
//for循环中有3个表达式，这3个表达式都是可选的，也就是说for循环可以没有表达式，如for(;;)这样的for循环将是一个无限循环，
// 读者在使用for循环时应该注意避免无限循环。

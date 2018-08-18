package E31;

/**
 * 创建ProductPrice类，在该类的主方法中实现本实例的业务代码，该方法首先假设一个用户消费总额的变量money，
 * 并初始化一个折扣变量rebate，然后经过运算来获得用户等级，对不同的等级给予不同的折扣优惠
 */
public class ProductPrice {
    public static void main(String[] args) {
        float money = 1206; //金额
        float rebate = 0f;  //折扣
        if(money > 200){
            int grade = (int) (money/200); //等级
            switch (grade){                //根据等级计算折扣比例
                case 1:
                    rebate = 0.95f;
                    break;
                case 2:
                    rebate = 0.90f;
                    break;
                case 3:
                    rebate = 0.85f;
                    break;
                case 4:
                    rebate = 0.83f;
                    break;
                case 5:
                    rebate = 0.80f;
                    break;
                case 6:
                    rebate = 0.78f;
                    break;
                case 7:
                    rebate = 0.75f;
                    break;
                case 8:
                    rebate = 0.73f;
                    break;
                case 9:
                    rebate = 0.70f;
                    break;
                case 10:
                    rebate = 0.65f;
                    break;
                default:
                    rebate = 0.60f;

            }
        }
        System.out.println("您的累计消费金额为："+money); //输出消费金额
        System.out.println("您将享受"+rebate+"折优惠！");
        System.out.println(-40%2);
    }
}
//在程序开发中经常使用的都是正数，负数因为使用的少，常常被忽略。例如，“N%2==1”本来是用来计算数字N是否为奇数的，
//但是开发者没有考虑到负数的情况，从而导致这个算法的失败，因为任何负数应用这个算法都会等于-1.
//??? 上述有问题啊，-40%2就等于0，不是所有负数对2求余都为-1

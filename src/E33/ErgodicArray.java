package E33;

/**
 * 创建ErgodicArray类，在该类的主方法中创建一个鸟类数组，然后创建一个索引变量，这个变量用于指定数组下标，
 * 随着该索引的递增，while循环会逐步获取每个数组的元素并输出到控制台中。
 */
public class ErgodicArray {
    public static void main(String[] args) {
        //创建鸟类数组
        String[] aves = new String[]{"白鹭","丹顶鹤","黄鹂","乌鸦","喜鹊","布谷鸟","灰纹鸟","百灵鸟"};
        int index = 0;//创建索引变量
        System.out.println("我的花园里有很多鸟，种类大约包括：");
        while(index < aves.length){  //遍历数组
            System.out.println(aves[index++]);//自增索引值
        }
    }
}
//自增自减运算符分前置与后置两种，其中前置运算如“++index”会先将index的值递增，然后再使用递增后的值，
// 而后置运算符“index++”会首先使用该变量的值，然后再把变量值递增
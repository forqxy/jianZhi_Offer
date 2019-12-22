/**
 * Created by hsl on 2019-12-22
 * Time:星期日  22:02
 * desc:<进制转换,补码反码源码>
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 * 一个整数-1,所得的就是原本1后面的都取反,1变为0,再与本身与,就得到除去最右1后的数,继续操作得出几个1
 */
public class Num11 {
    public int numberOf1(int n){
        int count = 0;
        while (n !=0){
            ++count;
            n = n & (n-1);
        }
        return count;
    }
}

/**
 * Created by hsl on 2020-01-05
 * Time:星期日  22:19
 * desc:<整数中1出现的次数>
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）
 *
 * 总结一下，可以得出，当计算右数第  i  位包含的 X 的个数时：
 * 取第  i  位左边（高位）的数字，乘以10的(i−1)次方 ，得到基础值a 。
 * 取第  i  位数字，计算修正值：
 * 如果大于 X，则结果为  a+ 10^(i−1) 。
 * 如果小于 X，则结果为  a 。
 * 如果等 X，则取第  i  位右边（低位）数字，设为  b ，最后结果为  a+b+1
 */
public class Num30 {
    public int NumberOf1Between1AndN_Solution(int n){
        if(n < 0){
            return 0;
        }
        int i = 1;
        int high = n;
        int count = 0;
        while (high != 0){
            //当前的高位
            high = n/(int)Math.pow(10,i);
            int temp = n/(int)Math.pow(10,i-1);
            //当前的第i上的值X
            int cur = temp%10;
            //低位
            int low = n-temp*(int)Math.pow(10,i-1);
            if(cur < 1){
                count+=high*(int)Math.pow(10,i-1);
            }else if(cur > 1){
                count+=(high+1)*(int)Math.pow(10,i-1);
            }else{
                count+=high*(int)Math.pow(10,i-1);
                count+=(low+1);
            }
            i++;
        }
        return count;
    }
}

/**
 * Created by hsl on 2019-12-19
 * Time:星期四  22:50
 * desc:<贪心算法>
 * 青蛙跳台阶的变形
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Num09 {
    /**
     * f(n)=f(n-1)+f(n-2)+...+f(1)
     * f(n-1)=f(n-2)+f(n-3)+...+f(1)
     * 所以f(n)=2*f(n-1)
     * @param target
     * @return
     */
    public int jumpFloorII(int target) {
        if(target <= 0){
            return -1;
        }else if(target == 1){
            return 1;
        }else{
            return 2*jumpFloorII(target-1);
        }
    }
}

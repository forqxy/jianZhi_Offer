/**
 * Created by hsl on 2020-01-09
 * Time:星期四  23:07
 * desc:<一句话简述功能>
 * 统计一个数字在排序数组中出现的次数。
 */
public class Num35 {
    //既然是排序,二分法.这里就用暴力循环了.面试时候这么写就gg
    public int GetNumberOfK(int [] array , int k){
        int count = 0;
        for (int i = 0;i < array.length;i++){
            if(array[i] == k){
                count++;
            }
        }
        return count;
    }
}

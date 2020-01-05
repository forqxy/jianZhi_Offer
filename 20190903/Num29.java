/**
 * Created by hsl on 2020-01-05
 * Time:星期日  22:10
 * desc:<连续子数组的最大和>
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 给一个数组，返回它的最大连续子序列的和
 */
public class Num29 {
    public int FindGreatestSumOfSubArray(int[] array){
        if(array.length == 0){
            return 0;
        }else{
            int first = array[0];
            int maxVal = array[0];
            for(int i = 0;i < array.length;i++){
                if(first >= 0){
                    first+=array[i];
                }else{
                    first = array[i];
                }
                if(first > maxVal){
                    maxVal = first;
                }
            }
            return maxVal;
        }
    }
}

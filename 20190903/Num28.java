import java.util.ArrayList;

/**
 * Created by hsl on 2020-01-05
 * Time:星期日  21:56
 * desc:<最小的K个数>
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * 考察的排序算法
 */
public class Num28 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k){
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(k > input.length){
            return arrayList;
        }
        for(int i = 0;i < input.length;i++){
            for(int j = 0;j < input.length-i-1;j++){
                if(input[j] < input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
            arrayList.add(input[input.length-i-1]);
        }
        return arrayList;
    }
}

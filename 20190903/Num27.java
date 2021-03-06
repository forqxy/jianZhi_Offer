/**
 * Created by hsl on 2020-01-04
 * Time:星期六  23:36
 * desc:<一句话简述功能>
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Num27 {
    /**
     * 利用哨兵站哨,相同+1,不同-1.为0时换第二个哨兵
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution(int [] array){
        if(array.length == 0){
            return 0;
        }
        int result = array[0];
        int count = 1;
        for (int i = 0;i < array.length;i++){
            if(count == 0){
                result = array[i];
                count = 1;
            }else if(result == array[i]){
                count++;
            }else{
                count--;
            }
        }
        count = 0;
        for(int i = 0;i < array.length;i++){
            if(result == array[i]){
                count++;
            }
        }
        return count>(array.length)/2 ?result:0;
    }
}

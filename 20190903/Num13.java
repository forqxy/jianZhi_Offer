import java.util.ArrayList;
import java.util.List;

/**
 * Created by hsl on 2019-12-22
 * Time:星期日  22:41
 * desc:<数组>
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 复杂度为O(n)
 */
public class Num13 {
    public void reOrderArray(int [] array){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < array.length;i++){
            if((array[i]&1) == 1){
                list.add(array[i]);
            }
        }
        for(int i = 0; i < array.length;i++){
            if((array[i]&1) == 0){
                list.add(array[i]);
            }
        }
        for (int i =0; i < array.length; i++){
            array[i] = list.get(i);
        }
    }
}

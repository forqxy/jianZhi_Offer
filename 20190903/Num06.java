/**
 * Created by hsl on 2019-12-19
 * Time:星期四  22:25
 * desc:<查找---旋转数组的最小数字>
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 */
public class Num06 {
    public int minNumberInRotateArray(int [] array){
        if(array.length == 0){
            return 0;
        }
        int left = 0;
        int right = array.length-1;
        int mid = 0;
        while (right > left){
            if(right-left == 1){
                mid = right;
                break;
            }
            mid = (left+right)/2;
            if(array[mid] >= array[left]){
                left = mid;
            }
            if(array[mid] <= array[right]){
                right = mid;
            }
        }
        return array[mid];
    }
}

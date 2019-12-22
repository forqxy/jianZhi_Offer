/**
 * Created by hsl on 2019-12-22
 * Time:星期日  21:44
 * desc:<递归>
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Num10 {
    public int rectCover(int target){
        if(target <= 0){
            return 0;
        }else if (target == 1 || target == 2){
            return target;
        }else{
            return rectCover(target-1) + rectCover(target-2);
        }
    }
}

import java.util.ArrayList;

/**
 * Created by hsl on 2020-01-07
 * Time:星期二  22:27
 * desc:<丑数>
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Num32 {
    public int GetUglyNumber_Solution(int index){
        if(index == 0){
            return 0;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        arrayList.add(1);
        while (arrayList.size() < index){
            int m2 = arrayList.get(i2)*2;
            int m3 = arrayList.get(i3)*3;
            int m5 = arrayList.get(i5)*5;
            int min = Math.min(m2,Math.min(m3,m5));
            arrayList.add(min);
            if(min == m2){
                i2++;
            }
            if(min == m3){
                i3++;
            }
            if(min == m5){
                i5++;
            }
        }
        return arrayList.get(arrayList.size()-1);
    }
}

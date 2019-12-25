import java.util.ArrayList;

/**
 * Created by hsl on 2019-12-25
 * Time:星期三  22:40
 * desc:<一句话简述功能>
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵：
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Num19 {
    public ArrayList<Integer> printMatrix(int [][] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //行数
        int row = arr.length;
        //列数
        int line = arr[0].length;
        //循环圈数
        int cycle = ((row > line?line:row)-1)/2+1;
        for(int i = 0;i < cycle; i++){
            //左到右→
            for(int j = i;j < line-i;j++){
                list.add(arr[i][j]);
            }
            //上到下↓,除去第一行k=i+1,line-1因为数组从0开始
            for(int k = i + 1;k < row-i; k++){
                list.add(arr[k][line-1-i]);
            }
            //右到左← line-1除去最右列,再-1因为数组0开始
            for(int m = line-2-i;(m>=i)&&(row-i-1!=i);m--){
                list.add(arr[row-i-1][m]);
            }
            //下到上↑ 同理n=row-1-1-i
            for(int n = row-i-2;(row>=i)&&(line-i-1!=i);n--){
                list.add(arr[n][i]);
            }
        }
        return list;
    }
}

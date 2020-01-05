/**
 * Created by hsl on 2020-01-05
 * Time:星期日  22:56
 * desc:<把数组排成最小的数>
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 */
public class Num31 {
    public String PrintMinNumber(int [] numbers){
        String str = "";
        for(int i = 0;i < numbers.length;i++){
            for(int j = i+1;j < numbers.length;j++){
                int a = Integer.valueOf(numbers[i] + "" +numbers[j]);
                int b = Integer.valueOf(numbers[j] + "" +numbers[i]);
                if(a > b){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for(int i = 0;i < numbers.length;i++){
            str+=String.valueOf(numbers[i]);
        }
        return str;
    }
}

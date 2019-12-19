/**
 * Created by hsl on 2019-12-19
 * Time:星期四  22:37
 * desc:<递归---斐波那契数列>
 * 要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Num07 {
    public int fibonacci(int n){
        if(n <= 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else if(n == 2){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }

    }
}

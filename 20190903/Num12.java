/**
 * Created by hsl on 2019-12-22
 * Time:星期日  22:23
 * desc:<数字>
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 */
public class Num12 {
    /**
     * 利用二进制
     * 2^1011 = 2^0001 * 2^0010 * 2^1000
     * @param base
     * @param exponent
     * @return
     */
    public double power(double base, int exponent){
        double result = 1d;
        double curr = base;
        int n = exponent;
        if(exponent > 0){
            exponent = n;
        }else if(exponent == 0){
            return 1;
        }else if(exponent < 0){
            exponent = -n;
        }
        while (exponent != 0){
            if((exponent&1) == 1){
                result = result * curr;
                curr*=curr;
                exponent>>=1;
            }
        }
        return n > 0?result:(1/result);
    }
}

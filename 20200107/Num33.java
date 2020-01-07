/**
 * Created by hsl on 2020-01-07
 * Time:星期二  22:46
 * desc:<第一个只出现1次的字符>
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class Num33 {
    public int FirstNotRepeatingChar(String str){
        char[] chars = str.toCharArray();
        int[] nums = new int['z'+1];
        for(int i = 0;i < chars.length;i++){
            nums[(int)chars[i]]++;
        }
        for(int i = 0;i < chars.length;i++){
            if(nums[(int)chars[i]] == 1){
                return i;
            }
        }
        return -1;
    }
}

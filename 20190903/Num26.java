import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hsl on 2020-01-02
 * Time:星期四  23:31
 * desc:<字符串,动态规划,递归>
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class Num26 {
    public ArrayList<String> permutation(String str){
        ArrayList<String> list = new ArrayList<>();
        if(!str.isEmpty()){
            PermutationHelper(str.toCharArray(),0,list);
        }
        return list;
    }

    private void PermutationHelper(char[] chars,int i,ArrayList<String> list){
        if(i == chars.length-1){
            list.add(String.valueOf(chars));
        }else{
            Set<Character> characters = new HashSet<>();
            for (int j = i;j < chars.length-1;j++){
                if(j == i || !characters.contains(chars[j])){
                    characters.add(chars[j]);
                    swap(chars,i,j);
                    PermutationHelper(chars,i+1,list);
                    swap(chars,i,j);
                }
            }
        }
    }
    private void swap(char[] arr,int a,int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

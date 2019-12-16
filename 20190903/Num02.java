/**
 * Created by hsl on 2019-12-16
 * Time:星期一  23:16
 * desc:<替换空格>知识点:字符串
 * question:请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * https://www.nowcoder.com/questionTerminal/4060ac7e3e404ad1a894ef3e17650423
 */
public class Num02 {
    public String replaceSpace(String sbf){
        char [] a = sbf.toCharArray();
        StringBuffer stb = new StringBuffer();
        for (int i = 0; i < a.length; i++){
            if(' ' == a[i]){
                stb.append("%20");
            }else{
                stb.append(a[i]);
            }
        }
        return stb.toString();
    }
}

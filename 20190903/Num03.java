import java.util.ArrayList;
import java.util.List;

/**
 * Created by hsl on 2019-12-17
 * Time:星期二  23:39
 * desc:<知识点-链表>
 * question:输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * https://www.nowcoder.com/questionTerminal/d0267f7f55b3412ba93bd35cfa8e8035
 * 思路:可以用递归,也可以用堆栈的先进后出特点,先入栈,再出栈
 */
public class Num03 {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    public ArrayList<Integer> num03(ListNode listNode){
        if (listNode != null){
            num03(listNode.next);
            arr.add(listNode.val);
        }
        return arr;
    }
}

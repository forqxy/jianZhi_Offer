/**
 * Created by hsl on 2019-12-23
 * Time:星期一  23:50
 * desc:<链表>
 * 输入一个链表，反转链表后，输出新链表的表头。pre->head->next1->next2
 */
public class Num15 {
    public ListNode reverseList(ListNode head){
        if(head == null){
            return null;
        }
        //pre为前一节点,next为后一节点
        ListNode pre = null;
        ListNode next = null;
        while (head!=null){
            //先保存头结点下一节点
            next = head.next;
            //反转
            head.next = pre;
            //继续反转
            pre = head;
            //循环
            head = next;
        }
        return pre;
    }
}

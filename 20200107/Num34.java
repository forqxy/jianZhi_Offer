/**
 * Created by hsl on 2020-01-07
 * Time:星期二  23:07
 * desc:<两个链表的第一个公共节点>
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class Num34 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2){
        ListNode listNode1 = pHead1;
        ListNode listNode2 = pHead2;
        while (listNode1 !=listNode2){
            listNode1 = (listNode1 == null?pHead2:listNode1.next);
            listNode2 = (listNode2 == null?pHead1:listNode2.next);
        }
        return listNode1;
    }
}

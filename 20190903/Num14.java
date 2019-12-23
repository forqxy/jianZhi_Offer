/**
 * Created by hsl on 2019-12-23
 * Time:星期一  23:18
 * desc:<链表>
 * 输入一个链表，输出该链表中倒数第k个结点。{1,2,3,4,5,6} 5
 * 思路:定义两个指针,一个走了k步之后第2个开始走.第一个结束的时候,第2个就是倒数第k个节点
 */
public class Num14 {
    public ListNode findKthToTail(ListNode head,int k){
        ListNode listNode01 = head;
        ListNode listNode02 = head;
        int i = 0;
        for(; listNode01 != null; i++){
            if(i >= k){
                listNode02 = listNode02.next;
            }
            listNode01 = listNode01.next;
        }
        return i<k? null:listNode02;
    }
}

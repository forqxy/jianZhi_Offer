import java.util.Stack;

/**
 * Created by hsl on 2019-12-18
 * Time:星期三  23:05
 * desc:<队列,栈>
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class Num05 {
    Stack<Integer> stack01 = new Stack<>();
    Stack<Integer> stack02 = new Stack<>();

    public void push(int node){
        stack01.push(node);
    }

    public int pop(){
        if(stack01.empty() && stack02.empty()){
            throw new RuntimeException("stack为空");
        }
        if(stack02.empty()){
            while (!stack01.empty()){
                stack02.push(stack01.pop());
            }
        }
        return stack02.pop();
    }
}

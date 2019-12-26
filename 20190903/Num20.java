import java.util.Stack;

/**
 * Created by hsl on 2019-12-26
 * Time:星期四  22:11
 * desc:<栈>
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class Num20 {
    Stack<Integer> stackData = new Stack<Integer>();
    Stack<Integer> stackMin = new Stack<Integer>();
    public void push(int node) {
        stackData.push(node);
        if(stackMin.empty()){
            stackMin.push(node);
        }else if(node < stackMin.peek()){
            stackMin.push(node);
        }else{
            stackMin.push(stackMin.peek());
        }
    }

    public void pop() {
        stackData.pop();
        stackMin.pop();
    }

    public int top() {
        return stackData.peek();
    }

    public int min() {
        return stackMin.peek();
    }
}

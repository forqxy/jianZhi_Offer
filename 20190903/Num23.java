/**
 * Created by hsl on 2019-12-30
 * Time:星期一  22:03
 * desc:<一句话简述功能>
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Num23 {
    public boolean verifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0){
            return false;
        }
        if(sequence.length == 1){
            return true;
        }
        return judge(sequence,0,sequence.length-1);
    }

    private boolean judge(int[] arr,int start,int end){
        //没左子树...
        if(start >= end){
            return true;
        }
        int i = start;
        int root = arr[end];
        //遍历序列,找到第一个大于等于根结点的元素i,则i左侧为左子树、i右侧为右子树
        while (arr[i] < root){
            i++;
        }
        for(int j = i;j < end;j++){
            if(arr[j] < root){
                return false;
            }
        }
        return judge(arr,start,i-1)&&judge(arr,i,end-1);
    }
}

/**
 * Created by hsl on 2019-12-18
 * Time:星期三  0:04
 * desc:<二叉树>
 * question:输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 思路:递归
 */
public class Num04 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConBTree(pre,0,pre.length-1,in,0,in.length-1);
    }

    /**
     * @param pre 前序遍历
     * @param preleft 前序遍历起始位置
     * @param preright 前序遍历末位
     * @param in 中序遍历
     * @param inleft 中序遍历起始位置
     * @param inright 中序遍历末位
     * @return
     */
    public TreeNode reConBTree(int [] pre,int preleft,int preright,int [] in,int inleft,int inright){
        if(preleft > preright || inleft > inright){
            return null;
        }
        TreeNode root = new TreeNode(pre[preleft]);
        for(int i = inleft; i <= inright; i++){
            if(pre[preleft] == in[i]){
                root.left = reConBTree(pre,preleft+1,i-inleft+preleft,in,inleft,i-1);
                root.right = reConBTree(pre,preleft+i+1-inleft,preright,in,i+1,inright);
            }
        }
        return root;
    }
}

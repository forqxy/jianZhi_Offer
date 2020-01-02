/**
 * Created by hsl on 2020-01-02
 * Time:星期四  23:22
 * desc:<一句话简述功能>
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Num25 {
    TreeNode list = null;
    public TreeNode convert(TreeNode pRootOfTree){
        if(pRootOfTree == null){
            return pRootOfTree;
        }
        //中序遍历.从右开始,可少中间变量
        convert(pRootOfTree.right);
        if(list == null){
            list = pRootOfTree;
        }else{
            list.left = pRootOfTree;
            pRootOfTree.right = list;
            list = pRootOfTree;
        }
        convert(pRootOfTree.left);
        return list;
    }
}

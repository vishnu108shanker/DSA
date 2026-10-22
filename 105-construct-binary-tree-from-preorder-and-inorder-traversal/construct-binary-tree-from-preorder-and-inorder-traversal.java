
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return construction(preorder , inorder , 0 , 0 , inorder.length-1 ) ;
    }

    private TreeNode construction(int[] preorder , int[] inorder , int index , int l , int r ){

        if(index >= preorder.length || l>r ) return null ;

        TreeNode root = new TreeNode() ;
        root.val = preorder[index] ;
        int inorder_index = bs(root.val , inorder , l , r ) ;
        
        root.left = construction(preorder , inorder ,index+1 , l, inorder_index - 1 ) ;
        root.right = construction(preorder , inorder ,index + inorder_index - l + 1 , inorder_index +1 , r ) ;

        return root ;
    }

    private int bs(int val , int[] inorder , int l , int r ){
        for(int i = l ; i<= r ; i++ ){
            if(inorder[i] == val ) return i ;
        }
        return -1 ;
    }
}
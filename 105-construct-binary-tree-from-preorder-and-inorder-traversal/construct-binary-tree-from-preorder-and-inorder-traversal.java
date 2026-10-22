
// class Solution {
//     public TreeNode buildTree(int[] preorder, int[] inorder) {
//         return construction(preorder , inorder , 0 , 0 , inorder.length-1 ) ;
//     }

//     private TreeNode construction(int[] preorder , int[] inorder , int index , int l , int r ){

//         if(index >= preorder.length || l>r ) return null ;

//         TreeNode root = new TreeNode() ;
//         root.val = preorder[index] ;
//         int inorder_index = bs(root.val , inorder , l , r ) ;
        
//         root.left = construction(preorder , inorder ,index+1 , l, inorder_index - 1 ) ;
//         root.right = construction(preorder , inorder ,index + inorder_index - l + 1 , inorder_index +1 , r ) ;

//         return root ;
//     }

//     private int bs(int val , int[] inorder , int l , int r ){
//         for(int i = l ; i<= r ; i++ ){
//             if(inorder[i] == val ) return i ;
//         }
//         return -1 ;
//     }
// }

class Solution {
    private Map<Integer, Integer> pos = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) pos.put(inorder[i], i);
        return build(preorder, 0, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int index, int l, int r) {
        if (l > r) return null;

        TreeNode root = new TreeNode(preorder[index]);
        int mid = pos.get(root.val);

        root.left = build(preorder, index + 1, l, mid - 1);
        root.right = build(preorder, index + 1 + (mid - l), mid + 1, r);

        return root;
    }
}
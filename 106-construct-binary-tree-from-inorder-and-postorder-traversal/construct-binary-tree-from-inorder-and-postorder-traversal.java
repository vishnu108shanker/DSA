class Solution {
    private Map<Integer, Integer> pos = new HashMap<>();

    public TreeNode buildTree( int[] inorder , int[] postorder) {
        pos.clear();
        reverse(postorder);
        for (int i = 0; i < inorder.length; i++) {
            pos.put(inorder[i], i);
        }
        
        return build(postorder, 0, 0, inorder.length - 1);
    }

private TreeNode build(int[] postorder, int index, int l, int r) {
    if (l > r || index < 0 || index >= postorder.length) {
        return null;
    }

    TreeNode root = new TreeNode(postorder[index]);

    int mid = pos.get(postorder[index]);

    root.right = build(postorder, index + 1, mid + 1, r);
    root.left = build(postorder, index + 1 + (r - mid), l, mid - 1);

    return root;
}

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

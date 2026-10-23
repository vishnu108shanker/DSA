public class Codec {

    public String serialize(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    preorder(root, sb);
    return sb.toString();
}

private void preorder(TreeNode root, StringBuilder sb) {
    if (root == null) {
        sb.append("null,");
        return;
    }

    sb.append(root.val).append(",");

    preorder(root.left, sb);
    preorder(root.right, sb);
}

    // Decodes your encoded data to tree.
    public TreeNode treeBuild(String[] st , int[] index){
        String token = st[index[0]];
        index[0]++;

        if(token.equals("null")) return null;

        TreeNode node = new TreeNode(Integer.parseInt(token));
        node.left = treeBuild(st , index);
        node.right = treeBuild(st , index);

        return node;
    }
    public TreeNode deserialize(String data) {
        String[] tokens = data.split(",");
        int[] index = {0};
        return treeBuild(tokens , index);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
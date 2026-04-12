class Solution {
    public int lengthOfLIS(int[] nums) {
        int maxcount = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(Integer.MIN_VALUE); // sentinel

        for (int x : nums) {
            if (x <= q.peek()) {
                // save count before reset
                maxcount = Math.max(maxcount, q.size() - 1);
                // remove elements greater than x
                while (!q.isEmpty() && q.peek() > x) {
                    q.poll();
                }
                q.add(x);
            } else {
                q.add(x);
                maxcount = Math.max(maxcount, q.size() - 1);
            }
        }
        return Math.max(maxcount, q.size() - 1);
    }
}
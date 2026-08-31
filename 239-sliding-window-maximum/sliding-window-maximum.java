class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int i = 0;
        int j = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        while (j < nums.length) {

            // Remove smaller elements from back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[j]) {
                dq.pollLast();
            }

            dq.addLast(j);

            // Remove elements outside window
            if (dq.peekFirst() < i) {
                dq.pollFirst();
            }

            // Window size = k
            if (j - i + 1 == k) {

                arr.add(nums[dq.peekFirst()]);

                i++;
            }

            j++;
        }

        int[] ans = new int[arr.size()];

        for (int x = 0; x < arr.size(); x++) {
            ans[x] = arr.get(x);
        }

        return ans;
    }
}
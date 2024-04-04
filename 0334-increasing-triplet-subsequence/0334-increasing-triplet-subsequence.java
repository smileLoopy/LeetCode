class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int x =  Integer.MAX_VALUE;
        int y =  Integer.MAX_VALUE;
        
        // 1, 2, 3, 4, 5
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= x) {
                x = nums[i]; // 1 
            } else if (nums[i] <= y) {
                y = nums[i]; // 2
            } else {
                return true; // 3 -> return true
            }
        }
        return false;
    }
}
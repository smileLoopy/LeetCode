class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // Whatever so the left times everything to the right
        int length = nums.length;
        
        int[] left_products = new int[length];
        int[] right_products = new int[length];
        
        int[] output_array = new int[length];
        
        left_products[0] = 1; // First item of the array is 1
        right_products[length-1] = 1; // Last item of the array is 1
        
        for (int i=1; i<length; i++) { // Start adding values from second item from the left. First item is alreay 1
            left_products[i] = nums[i-1] * left_products[i-1];
        }
        
        for (int i=length-2; i>=0; i--) { // Start adding values from second item from the right. First item is alreay 1
            right_products[i] = nums[i+1] * right_products[i+1];
        }
        
        //Multipying the whatever so the left with everything to the right
        for (int i=0; i<length; i++) {
            output_array[i] = left_products[i] * right_products[i];
        }
        
        return output_array;
        
    }
}
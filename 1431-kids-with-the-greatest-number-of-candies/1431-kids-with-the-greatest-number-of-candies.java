class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ///* Hint: candies[i] + extraCandies ≥ maximum in Candies[i] *///
        
        // Find maximum in Candies array
        int maximum = maximum(candies);
        // Empty output array
        ArrayList<Boolean> output = new ArrayList<>();
        
        // Check greatest
        for (int i = 0; i < candies.length; i++) {
            
            if(candies[i] + extraCandies >= maximum) {
                output.add(true);
            } else {
                output.add(false);
            }
        }
        
        return output;
        
    }
    
     private static int maximum(int[] candies) {
        
         // Initialize max with the first element of the array
         int max = candies[0];
        
         // Iterate through the array to find the maximum number
         for (int i = 0; i < candies.length; i++) {
            
            if (candies[i] > max) {
                max = candies[i];
            } 
             
        }
        
        return max;
         
     }
}
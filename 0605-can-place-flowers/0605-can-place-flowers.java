class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        // Assume that there are two dummy zeros at the beginning and the end
        int[] canPlaceFlowersPlusDummy = new int[flowerbed.length + 2];
        
        // Result value
        boolean result = false;
        canPlaceFlowersPlusDummy[0] = 0;
        canPlaceFlowersPlusDummy[canPlaceFlowersPlusDummy.length - 1] = 0;
        
        System.arraycopy(flowerbed, 0, canPlaceFlowersPlusDummy, 1, flowerbed.length);
        
        // Looping the array while skipping the first & last dummy values
        // if three values are empty continuously -> can be planted
        for (int i = 1; i < canPlaceFlowersPlusDummy.length - 1; i++) {
            if (canPlaceFlowersPlusDummy[i - 1] == 0 && canPlaceFlowersPlusDummy[i] == 0 &&        
                canPlaceFlowersPlusDummy[i + 1] == 0) {
                canPlaceFlowersPlusDummy[i] = 1;
                
                n = n - 1;

            }
        }
        
        if (n <= 0) {
            result = true;
        }
    
        return result;
    }
}
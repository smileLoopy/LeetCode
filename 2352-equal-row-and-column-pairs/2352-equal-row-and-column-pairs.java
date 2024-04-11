class Solution {
    public int equalPairs(int[][] grid) {
        /*
        3 2 1
        1 7 6
        2 7 7
        */
        
        int n = grid.length;
        int count = 0;

        // Step 1: Iterate through each row and column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Step 2: Compare rows and columns
                if (isEqual(grid[i], getColumn(grid, j), n)) { // 3 2 1 == 3 2 1
                    // Step 3: Count equal pairs
                    count++;
                }
            }
        }

        // Step 4: Return the count
        return count;
    }
    
    // Helper function to get the column at index j
    public int[] getColumn(int[][] grid, int j) {
        int n = grid.length; // 3
        int[] column = new int[n]; // [[], [], []]
        for (int i = 0; i < n; i++) {
            column[i] = grid[i][j]; // 3 2 1 -> j is the column index 1row 1col, 2row 1col, 3row 1col
        }
        return column;
    }
            
    // Helper function to check if two arrays are equal
    private boolean isEqual(int[] arr1, int[] arr2, int n) {
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) { // [3,2,1] != [3,2,1] 
                return false;
            }
        }
        return true;
    }
    
}
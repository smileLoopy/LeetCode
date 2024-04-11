class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> occurrencesMap = new HashMap<>();

        // Count the occurrences of each element
        for (int num : arr) {
            occurrencesMap.put(num, occurrencesMap.getOrDefault(num, 0) + 1);
        }
        
        System.out.println(occurrencesMap);
        
        Set<Integer> occurencesSet = new HashSet<>();
        
        // Check if the count of occurences is unique
        for (int count : occurrencesMap.values()) {
            if(!occurencesSet.add(count)) {
                return false;
            }
        }
        
        return true;
    }
}
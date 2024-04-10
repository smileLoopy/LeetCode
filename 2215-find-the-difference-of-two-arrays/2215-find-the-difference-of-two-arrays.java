class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        //Insert elements from arrays to sets
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        System.out.println(set1);
        System.out.println(set2);
        
        
        List<Integer> answer1 = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();
        
        //Find elements in nums1 not in nums2
        for (int num : set1) {
            if(!set2.contains(num)) {
                answer1.add(num);
            }
        }
        
        //Find elements in nums2 not in nums1
        for (int num : set2) {
            if(!set1.contains(num)) {
                answer2.add(num);
            }
        }
        
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(answer1);
        answer.add(answer2);
        
        return answer;
    }
}
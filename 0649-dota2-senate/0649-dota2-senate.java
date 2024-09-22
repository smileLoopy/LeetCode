class Solution {
    public String predictPartyVictory(String senate) {

        Queue<Integer> radiantQueue = new LinkedList<>();
        Queue<Integer> direQueue = new LinkedList<>();

        // Initialize queues with the positions of each party's senators
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                radiantQueue.offer(i);
            } else {
                direQueue.offer(i);
            }
        }

        int n = senate.length();
        
        // Process the voting rounds
        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            // Get the indices of the first senator from each party
            int radiantIndex = radiantQueue.poll();
            int direIndex = direQueue.poll();

            // The senator with the smaller index acts first
            if (radiantIndex < direIndex) {
                // Radiant senator bans the Dire senator
                radiantQueue.offer(radiantIndex + n); // Re-add Radiant senator to the end
            } else {
                // Dire senator bans the Radiant senator
                direQueue.offer(direIndex + n); // Re-add Dire senator to the end
            }
        }

        // Determine which party has remaining senators
        return radiantQueue.isEmpty() ? "Dire" : "Radiant";
        
    }
}
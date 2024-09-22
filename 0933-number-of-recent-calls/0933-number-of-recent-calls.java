class RecentCounter {

 private LinkedList<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        // Add the current ping time to the list
        requests.add(t);
        // Remove timestamps that are outside the range [t - 3000, t]
        while (requests.peek() < t - 3000) {
            requests.poll(); // Remove the oldest request
        }
        // The size of the list is the count of recent requests
        return requests.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
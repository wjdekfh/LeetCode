class Solution {
    public int numSquares(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int count = 0;
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
				
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int sz = 0; sz < size; sz++) {
                int cur = queue.poll();
                if (cur > n) {
                    continue;
                }
                if (cur == n) {
                    return count;
                }
                for (int i = 1; cur + i * i <= n; i++) {
                    if (visited.contains(cur + i * i)) {
                        continue;
                    }
                    queue.add(cur + i * i);
                    visited.add(cur + i * i);
                }
            }
            count++;
        }

        return -1;
    }
}
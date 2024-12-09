class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
         if (intervals == null || intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int removalCount = 0;
        int lastEnd = Integer.MIN_VALUE;

        for (int[] interval : intervals) {
            if (interval[0] < lastEnd) {
                removalCount++;
            } else {
                lastEnd = interval[1];
            }
        }

        return removalCount;
    }
}

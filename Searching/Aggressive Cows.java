class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls); 
        int low = 1; 
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2; 
            if (canPlaceCows(stalls, k, mid)) {
                ans = mid; 
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return ans;
    }

    static boolean canPlaceCows(int[] stalls, int k, int dist) {
        int cows = 1; 
        int lastPlaced = stalls[0]; 

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPlaced >= dist) {
                cows++;
                lastPlaced = stalls[i];
            }
            if (cows == k) return true; 
        }
        return false; 
    }
        
    }
        

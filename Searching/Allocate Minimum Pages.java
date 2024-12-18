class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        if(arr.length<k){
            return -1;
        }
         int low = getMax(arr); 
        int high = getSum(arr); 
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isFeasible(arr, k, mid)) {
                result = mid; 
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }

        return result;
    }

    private static boolean isFeasible(int[] arr, int k, int maxPages) {
        int studentsRequired = 1;
        int currentSum = 0;

        for (int pages : arr) {
            if (pages > maxPages) return false; 
            if (currentSum + pages > maxPages) {
                studentsRequired++; 
                currentSum = pages;

                if (studentsRequired > k) return false; 
            } else {
                currentSum += pages;
            }
        }

        return true;
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}

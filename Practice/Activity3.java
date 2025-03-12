public class Activity3 {

    // Optimal Approach
    public static int splitarr(int arr[]){
        int n = arr.length;
        int totalsum = 0;
        for(int i = 0; i<n; i++){
            totalsum += arr[i];
        }

        int prefix =0;
        int suffix = 0;
        for (int i = 0; i<n; i++){
            prefix += arr[i];
            suffix  = totalsum - prefix;

            if (prefix == suffix){
                return i;
            }
        }
        return -1;
    }

    //Time Complexity = O(2n) = O(n)
    //Space Complexity = O(1)
    // Brute Force Approach
    public static int splitarrr(int arr[]){
        int n = arr.length;
        for(int i = 0; i<arr.length; i++){
            int prefixsum = 0;
            int suffixsum = 0;
            for (int j = 0; j<=i; j++){
                prefixsum += arr[j];
            }
            for(int j = i+1; j<n; j++){
                suffixsum += arr[j];
            }

            if (prefixsum == suffixsum){
                return i;
            }
        }
        return -1;
    }

    // Time Complexity = O(n^2)
    //Space Complexity = O(1)
    public static void main(String[] args) {
        int arr[] = {1,2,3,6};
        System.out.println(splitarr(arr));
        System.out.println(splitarrr(arr));
    }
}

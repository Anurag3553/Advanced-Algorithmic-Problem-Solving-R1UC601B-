public class Activity4 {
    //Brute Force Approach
    public static void findtraget(int arr[], int target){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if (arr[i] + arr[j] == target){
                    System.out.println("Pairs are found : ["+arr[i]+", "+arr[j]+"]" );
                    return;
                }
            }
        }
        System.out.println("Pairs are not found");
    }

    // Time Complexity is  : O(n^2)
    // Space Complexity is : O(1)

    //Optimal Approach
    public static void findtargett(int arr[], int target){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left < right){
            int sum = arr[left] + arr[right];
            if (sum == target){
                System.out.println("Pairs are found : ["+arr[left]+", "+arr[right]+"]");
                return;
            }else if (sum < target){
                left++;
            }else {
                right--;
            }
        }
        System.out.println("Pairs are not found");
    }

    // Time Complexity is  : O(n)
    // Space Complexity is : O(1)
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8,9};
        findtraget(arr,10);
        findtargett(arr,5);
    }
}

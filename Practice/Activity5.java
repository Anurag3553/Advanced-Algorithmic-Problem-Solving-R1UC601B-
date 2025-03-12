public class Activity5 {
    public static int maxsubarrya(int arr[]){
        int maxsubarray = arr[0];
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            if(sum > maxsubarray){
                maxsubarray = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxsubarray;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        System.out.println(maxsubarrya(arr));
    }
}

//  Equilibrium index using BruteForce approach
public class Activity2 {
    public static int[] equiidx(int arr[]){
        int n = arr.length;
        int equi[] = new int[n];

        for (int i = 0; i<n; i++){
            int leftSum = 0;
            int rightsum = 0;
            for(int j = 0; j<i; j++){
                leftSum += arr[j];
            }

            for(int j = i+1; j<n-1; j++){
                rightsum += arr[j];
            }
            if(leftSum == rightsum ){
                equi[i] = i;
            }
        }
        return equi;
    }

    public static void print(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int equi[] = equiidx(arr);
        print(equi);
    }
}

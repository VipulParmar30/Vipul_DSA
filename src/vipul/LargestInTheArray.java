package vipul;

public class LargestInTheArray {
    public static void main(String[] args) {
        int[]arr ={4 ,7, 8, 6 ,7, 6 };
        System.out.println(largestElement(arr,arr.length));
    }
    static int largestElement(int[] arr, int n) {
        int max=arr[0];
        for (int i = 1; i <arr.length; i++) {
         if(arr[i]>max)
         {
             max=arr[i];
         }
        }
        return max;
    }
}

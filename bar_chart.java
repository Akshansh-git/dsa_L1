/* 
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.

Constraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 10
*/
import java.util.*;

public class bar_chart{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int n = sc.nextInt();
        System.out.println("enter array elements");

        int max = Integer.MIN_VALUE;
        int arr[] = new int[n];

        for(int k=0;k<arr.length;k++){
            arr[k] = sc.nextInt();
            if(arr[k]>max){
                max =arr[k];
            }
        }
        
        for(int i=max;i>=1;i--){
            for(int j=0;j<n;j++){
                if(arr[j]>=i){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
//All prime factors of a positive integer. 

import java.util.*;
public class prime_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 2;
        sc.close();
        while(num > 1){
            if(num%count == 0){
                System.out.print(count + " ");
                num = num/count;
            }else{
                count++;
            }
        }
        System.out.println();
        System.out.println("*********");
    }
}

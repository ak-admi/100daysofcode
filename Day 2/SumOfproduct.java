//Construct array with sum of product of same indexed elements in the given array equal to zero
//Given an array, arr[] of size N (always even), the task is to construct a new array consisting of N non-zero integers such that the sum of the product of the same indexed elements of arr[] and the new array is equal to 0. If multiple solutions exist, print any one of them.

import java.util.*;

public class SumOfproduct {
    public static void main(String[] args) {
        int s, A[], B[];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        s = sc.nextInt();
        A = new int[s];
        B = new int[s];
        System.out.println("Enter the Elemnt of the Array");
        for (int i = 0; i < s; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < s; i++) {
            if (i % 2 == 0) {
                B[i] = A[i + 1];
            } else {
                B[i] = -A[i - 1];
            }
        }
        for (int i = 0; i < s; i++) {
            System.out.print(B[i] + " ");
        }
    }

}

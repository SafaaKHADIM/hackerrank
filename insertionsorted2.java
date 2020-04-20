import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {
        for (int j=1 ;j<n ; j++){
        int unsorted = arr[j];
        for (int i=0; i<j ;i++){
            if(arr[j-1-i]>=unsorted){
                arr[j-i]=arr[j-1-i];
           // for (int element: arr) {
           // System.out.printf("%d ",element);            
           // }
           // System.out.println();
                
            }
            else{
                arr[j-i]=unsorted;
                for (int element: arr) {
                 System.out.printf("%d ",element);            
            }
             System.out.println();
             break;
            }
        }
        if(arr[0]>unsorted){
            arr[0]=unsorted;
            for (int element: arr) {
            System.out.printf("%d ",element);            
            }
            System.out.println();

        }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }
}

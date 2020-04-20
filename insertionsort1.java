import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int unsorted = arr[n-1];
        for (int i=0; i<n-1 ;i++){
            if(arr[n-2-i]>=unsorted){
                arr[n-1-i]=arr[n-2-i];
            for (int element: arr) {
            System.out.printf("%d ",element);            
            }
            System.out.println();
                
            }
            else{
                arr[n-1-i]=unsorted;
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

        insertionSort1(n, arr);

        scanner.close();
    }
}

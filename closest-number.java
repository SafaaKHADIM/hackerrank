import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
        ArrayList<Integer> sortedarray = new ArrayList<Integer>(arr.length);
        for (int i : arr)
        {
        sortedarray.add(i);
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        Collections.sort(sortedarray);
        int sortir = 0;
        int maxdifference = sortedarray.get(sortedarray.size()-1)-sortedarray.get(0);
        for (int i=0; i<maxdifference; i++){
            for(int j=0; j<sortedarray.size()-1; j++){
            if ((sortedarray.get(j)-sortedarray.get(j+1)<i+1 &&sortedarray.get(j)-sortedarray.get(j+1)>0)||(sortedarray.get(j+1)-sortedarray.get(j)<i+1 && sortedarray.get(j+1)-sortedarray.get(j)>0)){
                result.add(sortedarray.get(j));
                result.add(sortedarray.get(j+1));
                sortir = 1;
            }
            }
            if(sortir ==1){
                int[] ret = new int[result.size()];
                 for (int ii=0; ii < ret.length; ii++)
                    {
                 ret[ii] = result.get(ii).intValue();
                }
                 
                 break;
            }
            
        }
        int[] ret = new int[result.size()];
                 for (int ii=0; ii < ret.length; ii++)
                    {
                 ret[ii] = result.get(ii).intValue();
                }
                 
                 return ret;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

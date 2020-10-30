import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the findDigits function below.
    static int findDigits(int n) {
     
        if(n<10 && n>=0){
            return n;
        }
        int digits = 10;
        int divisor =0;
        int copie = n;
        while(n/digits >=1){
            digits =digits*10;
            if(copie%10 !=0){
            if(n%(copie%10)==0){
               
                divisor++;
            }
            }
            copie/= 10;
            if(n/digits<1){
                if(n%(n%digits)==0){
                    divisor++;
                }
            }
        }

        return divisor;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

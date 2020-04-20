import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int a=0;
        String special ="!@#$%^&*()-+";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        for(int i=0;i<special.length();i++){
            if(password.indexOf(special.charAt(i))!=-1){
                a++;
                break;
            }
        }
        for(int i=0;i<numbers.length();i++){
            if(password.indexOf(numbers.charAt(i))!=-1){
                a++;
                break;
            }
        }
        for(int i=0;i<lower_case.length();i++){
            if(password.indexOf(lower_case.charAt(i))!=-1){
                a++;
                break;
            }
        }
        for(int i=0;i<upper_case.length();i++){
            if(password.indexOf(upper_case.charAt(i))!=-1){
                a++;
                break;
            }
        }
        if(a<4){
            if(password.length()>5){
                return 4-a;
            }
            else {
                if((6-password.length())<4-a){
                return 4-a;
                }
                else return 6-password.length();
            }
        }
        else if(a==4 && password.length()<6){return 6-password.length();}
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

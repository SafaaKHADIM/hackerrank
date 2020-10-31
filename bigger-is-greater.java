import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
        int changed = 0;
        String value="";
        char changedChar='a' ;
        String remainingString ="";


        if(w.length()==1){
            return "no answer";
        }


        if(w.length()>1){
        for (int i=w.length()-1; i>0;i--){
            if(Character.compare(w.charAt(i-1), w.charAt(i))<0){
                changed = 1;                
                for(int j=w.length()-1; j>i-1;j--){
                    if(Character.compare(w.charAt(i-1), w.charAt(j))<0){
                        changedChar =w.charAt(j);
                        System.out.println(changedChar);
                        if(j!=w.length()-1){
                        remainingString = w.substring(i-1,j)+w.substring(j+1,w.length());
                        }
                        else{                            
                            remainingString = w.substring(i-1,j);                                                        
                        }
                        break;
                    }
                }
                char tempArray[] = remainingString.toCharArray();
                Arrays.sort(tempArray);
                value=value+ w.substring(0,i-1)+changedChar+ new String(tempArray);
                break;
            }
        }
        }
        if(changed==1){
            return value;
        }
        else{
            return "no answer";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

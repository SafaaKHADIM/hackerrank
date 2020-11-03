import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String mystring) {

        int square = (int)Math.sqrt(mystring.length());
        
        //define rows and columns size
        int a=0;
        int b=0;
        if(square*square == mystring.length()){
            System.out.println("hihi");
            a=square;
            b=square;
        }
        else {if(square*(square+1)<mystring.length()){
            a=square+1;
            b=square+1;
        }
        else{
            a=square;
            b=square +1;
        }
        }

        //make the grid
        char[][] myGrid = new char[a][b]; 
        int i=0;
        
            for(int j=0; j<a; j++){
                for(int k=0; k<b; k++){
                    if(i<mystring.length()){
                    myGrid[j][k]=mystring.charAt(i);
                    i++;
                    }
                }
            }                        
        
        //form the result
        String result ="";
        for(int j=0; j<b;j++){
            for(int k=0; k<a ;k++){
                if(myGrid[k][j]!=0){
                result =result+ myGrid[k][j];
                }
            }
            result =result+ " ";
        }
        return result;
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

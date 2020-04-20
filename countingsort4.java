import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countSort function below.
    static void countSort(List<List<String>> arr) {
       
         StringBuffer output = new StringBuffer(); 
        for (int i=0; i<arr.size()/2 ; i++){
            arr.get(i).set(1,"-");
        }
        List<Integer> intList = new ArrayList<Integer>(arr.size());
        for (int i=0 ;i< arr.size();i++)
        {
             intList.add( Integer.parseInt(arr.get(i).get(0)));
        }

        

        ArrayList<Integer> newList = new ArrayList<Integer>(); 
        for (Integer element : intList) { 
            if (!newList.contains(element)) {  
                newList.add(element); 
            } 
        } 




        Collections.sort(newList);



       

        
        for (int i=0; i<newList.size();i++){
            int number =newList.get(i).intValue();
            for(int j=0; j<arr.size();j++){
                if( Integer.parseInt(arr.get(j).get(0))==number){
                    output.append(arr.get(j).get(1));
                    output.append(" ");
                }
                
            }
        }
        
        System.out.println(output);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")));
        }

        countSort(arr);

        bufferedReader.close();
    }
}

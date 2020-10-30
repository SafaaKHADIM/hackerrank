import java.io.;
import java.math.;
import java.security.;
import java.text.;
import java.util.;
import java.util.concurrent.;
import java.util.regex.;

public class Solution {

     Complete the utopianTree function below.
    static int utopianTree(int n) {
        int height = 1;
        for(int i=0; in ;i++){
            if(i%2==0){
                height = height2;
            }
            else{
                height =height +1;
            }
        }

        return height;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv(OUTPUT_PATH)));

        int t = scanner.nextInt();
        scanner.skip((rn[nru2028u2029u0085]));

        for (int tItr = 0; tItr  t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip((rn[nru2028u2029u0085]));

            int result = utopianTree(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

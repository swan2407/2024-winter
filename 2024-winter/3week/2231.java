package 2024-winter.3week;

import java.io.*;

public class 2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();
        
        int M = 0; 
        
        for(int i = 1; i <= N; i++) {
            int number = i; 
            int res = 0; 
            
            while(number > 0){ 
                res += number % 10; 
                number /= 10; 
            }

            if(res + i == N){ 
                M = i; 
                break; 
        }
        bw.write(M + "\n");
        bw.flush();
        bw.close();
    }
}
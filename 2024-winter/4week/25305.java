package 4week;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 25305 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =  new StringTokenizer(br.readLine()); 

        int N = Integer.parseInt(st.nextToken()); 
        int k = Integer.parseInt(st.nextToken()); 

        int[] score = new int[N];

        st =  new StringTokenizer(br.readLine()); 

        for(int i = 0; i < N; i++) { 
            score[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(score); 

        bw.write(score[N-k] +""); 
        bw.flush();
        bw.close();

    }
}
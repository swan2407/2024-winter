package 2024-winter.backjoon.src;
import java.util.Scanner;
public class 2738 {
    public static void main(String[] args){
        Scanner A = new Scanner(System.in);
        int N = A.nextInt();
        int M = A.nextInt();
        int[][] C = new int[N][M];
        int[][] E = new int[N][M];
        for(int i=0; i< N; i++ ){
            for(int j = 0; j < M; j++){
                C[i][j] = A.nextInt();
            }
        }
        
        for(int i=0; i< N; i++ ){
            for(int j = 0; j < M; j++){
                E[i][j] = A.nextInt();
            }
        }
        for(int i=0; i< N; i++ ){
            for(int j = 0; j<M; j++){
                System.out.print((C[i][j]+E[i][j]) + " ");
                if(j == M-1)
                   System.out.println(); 
            }
            
        }

    }
}

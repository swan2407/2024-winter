package 2024-winter.3week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class 2798 {
	public static int N,M;
	public static int[] map;
	public static boolean[] visited;
	public static int result = 0;
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	
    	map = new int[N];
    	visited = new boolean[N];
    	st = new StringTokenizer(br.readLine());
    	for(int i=0;i<N;i++) {
    		map[i] = Integer.parseInt(st.nextToken()); 
    	}
    	
    	simulate(0, 0, 0);
    	System.out.println(result);
    }
    public static void simulate(int idx, int sum, int cnt) {
    	if( cnt == 3) {
    		if(sum <= M) {
    			result = Math.max(result,  sum);	
    		}
    		return ;
    	}
    	
    	
    	for(int i=idx;i<N;i++) {
    		if(visited[i] == true) continue;
    		visited[i] = true;
    		simulate(idx + 1, sum + map[i], cnt + 1);
    		visited[i] = false;
    	}
    	
    }
 
}
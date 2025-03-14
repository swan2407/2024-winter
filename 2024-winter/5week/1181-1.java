package 5week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 1181-1 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String list[]=new String[N];
		for(int i=0; i<N; i++) 
			list[i] = br.readLine();
		
		Arrays.sort(list, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length())
					return o1.compareTo(o2);
				else
					return o1.length()-o2.length();
			}
		});
		for(int i=0; i<N; i++) {
			if(i!=0) {
				if(list[i].compareTo(list[i-1])!=0)
					System.out.println(list[i]);
			}
			else
				System.out.println(list[i]);
		}
	}
}
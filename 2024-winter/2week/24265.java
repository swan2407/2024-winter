package 2024-winter.2week;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 24265 {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Long n= Long.parseLong(br.readLine());

		System.out.println(n*(n-1)/2);
		System.out.println('2');
	}
}	
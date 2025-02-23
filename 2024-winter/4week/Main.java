package 4week;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        // arr이 왜 2001??
        // 문제에서 N은 1000이하의 값을 가지는데, 
        // 이 값은 절댓값이 1000보다 작거나 같은 수라고 한다.
        // 그래서 2000을 입력한 것이며 
        // 나머지 1은 0의 자리를 의미 (즉, 0번째 인덱스는 결국 1000과 동일)
        boolean[] arr = new boolean[2001];

        for(int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000] = true;
        }

        // -1000을 하면 0번째 인덱스부터 혹은, 음수부터 정렬되서 출력
        for(int i = 0; i < 2001; i++) {
            if(arr[i]) {
                System.out.println(i - 1000);
            }
        }
    }
}
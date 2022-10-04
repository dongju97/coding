package 그리드;
import java.util.Scanner;

public class 동전개수최솟값 {
    //P_11047
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for(int i =0;i< N; i++){
            A[i] = sc.nextInt();
        }
        //동전개수
        int count =0;
        for(int i=0; i<N;i++){
            if(A[i] <= M){
                count += (M / A[i]);//몫
                M = M % A[i];//나머지
            }
        }
        System.out.println(count);
    }
}
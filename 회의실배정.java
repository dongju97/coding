package 그리드;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 회의실배정 {
    //P_1913
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //회의개수
        int N = sc.nextInt();
        int[][] A = new int[N][2];
        for(int i =0; i<N; i++){
            A[i][0] = sc.nextInt();//회의 시작시간
            A[i][1] = sc.nextInt();// 종료시간
        }

        //종료시간을 기준으로 오름차순 정렬
        //종료시간이 같으면 시작시간이 빠른 순으로 정렬
        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] S, int[] E){
                if(S[1] == E[1]){
                    return S[0]-E[0];
                }
                return S[1]-E[1];
            }
        });

        int count = 0;
        int end = -1;
        for(int i=0; i< N;i++){
            if(A[i][0] >= end){
                end = A[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}

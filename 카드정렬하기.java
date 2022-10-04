package 그리드;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 카드정렬하기 {
    //P_1715
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    
    //우선정렬 -> 오름차순 정렬
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i=0 ; i< N; i++){
        int data = sc.nextInt();
        pq.add(data);
    }
    int data1 = 0; //배열중에 작은 두 값을 합해준다.
    int data2 = 0;
    int sum = 0;
    while(pq.size() != 1){
        data1= pq.remove();
        data2=pq.remove();//우선정렬 되어있어서 작은 두개 data 뽑기
        sum += data1 + data2;
        pq.add(sum);
    }
    System.out.println(sum);
    }
   
}
